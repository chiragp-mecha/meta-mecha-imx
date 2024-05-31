FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI = "git://github.com/chiragp-mecha/linux-imx.git;protocol=https;branch=mickledore-6.1.22"
SRCREV = "492e0a2188fff2bf6f621c5364b8f610a170baf4"

IMX_KERNEL_CONFIG_AARCH64 = "mecha_v8_defconfig"
