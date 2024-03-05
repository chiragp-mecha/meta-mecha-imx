DESCRIPTION = "Hardware PWM example channel pwm1"
SECTION = "Peripharals"
LICENSE="MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"


SRC_URI = "file://pwm02.c"

S = "${WORKDIR}"

TARGET_CC_ARCH += "${LDFLAGS}"

do_compile() {
         ${CC} pwm02.c -o pwm02
}

do_install() {
         install -d ${D}${bindir}
         install -m 0755 pwm02 ${D}${bindir}
}
