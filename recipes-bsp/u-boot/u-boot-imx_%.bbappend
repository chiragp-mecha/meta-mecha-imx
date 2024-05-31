FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

PATCHTOOL = "git"

UBOOT_DTB_NAME = "mecha-comet.dtb"

DEPENDS:append = " dtc-native bison-native"

SRC_URI = "git://github.com/chiragp-mecha/u-boot.git;protocol=https;branch=main"
SRCREV = "740ff8ec61af77922194f88212581bce9334b33a"

