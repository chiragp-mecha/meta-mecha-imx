DESCRIPTION = "Overlays File Upload"
SECTION = "Device tree overlay"
LICENSE="MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"


FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SAVE_DIR := "${THISDIR}/files"

FILES:${PN} += " \
		/boot \
		/boot/overlays.txt \
	"

do_install(){
	install -d ${D}/boot/
	install -m 644 ${SAVE_DIR}/overlays.txt ${D}/boot/overlays.txt
}

UBOOT_ENV = "overlays"
UBOOT_ENV_SUFFIX = "txt"
