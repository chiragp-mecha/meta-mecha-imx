#include <errno.h>
#include <fcntl.h>
#include <stdio.h>
#include <stdlib.h>
#include <sys/stat.h>
#include <sys/types.h>
#include <unistd.h>

void export_pwm0();
void set_period();
void set_duty_cycle();
void enable_pwm0();
void disable_pwm0();
void unexport_pwm0();


int main(int argc, char* argv[]) {
	
//char *string = argv[1]; 

int pwm_period = atoi(argv[1]);
int pwm_duty_cycle = atoi(argv[2]);

	printf("Pwm_period : %d\n", pwm_period);
	printf("Duty_cycle : %d\n", pwm_duty_cycle);


export_pwm0();
set_period(pwm_period);
set_duty_cycle(pwm_duty_cycle);

enable_pwm0();
sleep(3);
// set_duty_cycle(100);
// sleep(1);
// set_duty_cycle(1000);
// sleep(1);
// set_duty_cycle(2000);
// sleep(1);
// set_duty_cycle(5000);
// sleep(1);
// set_duty_cycle(10000);
// sleep(1);

disable_pwm0();
sleep(1);
unexport_pwm0();

    return 0;
}

void export_pwm0(){
    // Export the pwm0 pin by writing 0 to /sys/class/pwm/pwmchip1/export

    int fd = open("/sys/class/pwm/pwmchip1/export", O_WRONLY);
    if (fd == -1) {
        perror("Unable to open /sys/class/pwm/pwmchip1/export");
        exit(1);
    }
    if (write(fd, "0", 2) != 2) {
        perror("Error writing to /sys/class/pwm/pwmchip1/export");
        exit(1);
    }
    close(fd);
}


void set_period(int period){
    // Set the Period of PWM by writing "[10-1000000]" to /sys/class/pwm/pwmchip1/pwm0/period
    char buf[10];
    snprintf(buf, sizeof(buf), "%d", period);

    int fd = open("/sys/class/pwm/pwmchip1/pwm0/period", O_WRONLY);
    if (fd == -1) {
        perror("Unable to open /sys/class/pwm/pwmchip1/pwm0/period");
        exit(1);
    }
    if (write(fd, buf, 10) != 10) {
        perror("Error writing to /sys/class/pwm/pwmchip1/pwm0/period");
        exit(1);
    }
    close(fd);
}

void set_duty_cycle(int duty_cycle){
// Set the duty_cycle of PWM by writing "[10-1000000]" to /sys/class/pwm/pwmchip1/pwm0/duty_cycle
    char buf[10];
    snprintf(buf, sizeof(buf), "%d", duty_cycle);

    int fd = open("/sys/class/pwm/pwmchip1/pwm0/duty_cycle", O_WRONLY);
    if (fd == -1) {
        perror("Unable to open /sys/class/pwm/pwmchip1/pwm0/duty_cycle");
        exit(1);
    }
    if (write(fd, buf, 10) != 10) {
        perror("Error writing to /sys/class/pwm/pwmchip1/pwm0/duty_cycle");
        exit(1);
    }
    close(fd);
}

void enable_pwm0(){
// Enable pwm0 by writing 1 to /sys/class/pwm/pwmchip1/pwm0/enable

    int fd = open("/sys/class/pwm/pwmchip1/pwm0/enable", O_WRONLY);
    if (fd == -1) {
        perror("Unable to open /sys/class/pwm/pwmchip1/pwm0/enable");
        exit(1);
    }
    if (write(fd, "1", 2) != 2) {
        perror("Error writing to /sys/class/pwm/pwmchip1/pwm0/enable");
        exit(1);
    }
    close(fd);
}

void disable_pwm0(){
// Disable pwm0 by writing 0 to /sys/class/pwm/pwmchip1/pwm0/enable

system("echo 0 > /sys/class/pwm/pwmchip1/pwm0/enable");
//system("cat /sys/class/pwm/pwmchip1/pwm0/enable");

    // int fd = open("/sys/class/pwm/pwmchip1/pwm0/enable", O_WRONLY);  

    // system("cat /sys/class/pwm/pwmchip1/pwm0/enable");
    // if (fd == -1) {
    //     perror("Unable to open /sys/class/pwm/pwmchip1/pwm0/enable");
    //     exit(1);
    // }
    //  if (write(fd, "0", 1) != 1) {
    //      perror("Error writing to /sys/class/pwm/pwmchip1/pwm0/enable");
    //      exit(1);
    //  }
    //  close(fd);
}

void unexport_pwm0(){
// Unexport the pin by writing to /sys/class/gpio/unexport

    int fd = open("/sys/class/pwm/pwmchip1/unexport", O_WRONLY);
    if (fd == -1) {
        perror("Unable to open /sys/class/pwm/pwmchip1/unexport");
        exit(1);
    }

    if (write(fd, "0", 2) != 2) {
        perror("Error writing to /sys/class/pwm/pwmchip1/unexport");
        exit(1);
    }
    close(fd);
}
