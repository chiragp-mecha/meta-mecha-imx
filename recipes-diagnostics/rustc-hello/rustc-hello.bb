DESCRIPTION = "rustc"
SECTION = "Peripharals"
LICENSE="MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"


SRC_URI = "file://rustc-hello.rs"

S = "${WORKDIR}"

#TARGET_CC_ARCH += "${LDFLAGS}"
inherit rust clang
 
do_compile() {
        rustc rustc-hello.rs
}

# do_install() {
#          install -d ${D}${bindir}
#          install -m 0755 pwm01 ${D}${bindir}
# }
