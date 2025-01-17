#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>

#define OUTPUT "out"
#define INPUT "in"
#define LOW "0"
#define HIGH "1"

void pinMode(char pin[], char mode[]) {
	FILE *sysfs_export;
	FILE *sysfs_direction;
	char path[40] = "";
	sysfs_export = fopen("/sys/class/gpio/export", "w");
	fwrite(pin, 1, sizeof(pin), sysfs_export);
	fclose(sysfs_export);
	
	strcpy(path, "/sys/class/gpio/gpio");
	strcat(path, pin);
	strcat(path, "/direction");

	sysfs_direction = fopen(path, "w");
	fwrite(mode, 1, sizeof(mode), sysfs_direction);
	fclose(sysfs_direction);
}

void digitalWrite(char pin[], char value[]) {
	char path[40];
	FILE *sysfs_value;
	strcpy(path, "/sys/class/gpio/gpio");
	strcat(path, pin);
	strcat(path, "/value");

	sysfs_value = fopen(path, "w");
	fwrite(value, 1, sizeof(value), sysfs_value);
	fclose(sysfs_value);	
}

char digitalRead(char pin[]) {
	char path[40];
	char *buffer;
	buffer = malloc(sizeof(char));
	FILE *sysfs_value;
	strcpy(path, "/sys/class/gpio/gpio");
	strcat(path, pin);
	strcat(path, "/value");

	sysfs_value = fopen(path, "r");
	fread(buffer, sizeof(char), 1, sysfs_value);
	//printf("gpio_current_value : %c \n", *buffer);
	fclose(sysfs_value);	
	return *buffer;

}

void cleanUp(char pin[]) {
	FILE *sysfs_unexport;
	sysfs_unexport = fopen("/sys/class/gpio/unexport", "w");
	fwrite(pin, 1, sizeof(pin), sysfs_unexport);
	fclose(sysfs_unexport);
}


int main(int argc, char* argv[]) {
	
char *string = argv[1];

// int period = atoi(argv[2]);
// printf("Pin : %s\n", string);

	cleanUp(string);

	pinMode(string, INPUT);				
	
    if (digitalRead(string) == '1'){
        printf("Pin: %s is HIGH\n", string);
    }
    else {
        printf("Pin: %s is LOW\n", string);
    }

//	cleanUp(string);

	return 0;
}

