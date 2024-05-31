DESCRIPTION = "Read GPIO Pin Input"
SECTION = "HW-diagnostics"
LICENSE="MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"


SRC_URI = "file://readgpio.c"

S = "${WORKDIR}"

TARGET_CC_ARCH += "${LDFLAGS}"

do_compile() {
         ${CC} readgpio.c -o readgpio
}

do_install() {
         install -d ${D}${bindir}
         install -m 0755 readgpio ${D}${bindir}
}
