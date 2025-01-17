# Auto-Generated by cargo-bitbake 0.3.16
#
inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get mecha-device-test could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/mecha-device-test/0.1.0"
SRC_URI += "git://git@github.com/dhruveshb-mecha/mecha-device-test.git;protocol=ssh;nobranch=1;branch=mecha-pwm-test"
SRCREV = "c2caaa985a0e4889df543ba075d78a84c6fcb52a"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""
PV:append = ".AUTOINC+722c984c43"

# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/aho-corasick/1.0.2 \
    crate://crates.io/anstream/0.3.2 \
    crate://crates.io/anstyle-parse/0.2.0 \
    crate://crates.io/anstyle-query/1.0.0 \
    crate://crates.io/anstyle-wincon/1.0.1 \
    crate://crates.io/anstyle/1.0.0 \
    crate://crates.io/anyhow/1.0.71 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/cc/1.0.79 \
    crate://crates.io/cfg-expr/0.15.3 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/clap/4.3.4 \
    crate://crates.io/clap_builder/4.3.4 \
    crate://crates.io/clap_derive/4.3.2 \
    crate://crates.io/clap_lex/0.5.0 \
    crate://crates.io/colorchoice/1.0.0 \
    crate://crates.io/env_logger/0.10.0 \
    crate://crates.io/errno-dragonfly/0.1.2 \
    crate://crates.io/errno/0.3.1 \
    crate://crates.io/futures-channel/0.3.28 \
    crate://crates.io/futures-core/0.3.28 \
    crate://crates.io/futures-executor/0.3.28 \
    crate://crates.io/futures-macro/0.3.28 \
    crate://crates.io/futures-task/0.3.28 \
    crate://crates.io/futures-util/0.3.28 \
    crate://crates.io/gio-sys/0.17.10 \
    crate://crates.io/glib-macros/0.17.10 \
    crate://crates.io/glib-sys/0.17.10 \
    crate://crates.io/glib/0.17.10 \
    crate://crates.io/gobject-sys/0.17.10 \
    crate://crates.io/gstreamer-sys/0.20.0 \
    crate://crates.io/gstreamer/0.20.6 \
    crate://crates.io/hashbrown/0.12.3 \
    crate://crates.io/heck/0.4.1 \
    crate://crates.io/hermit-abi/0.3.1 \
    crate://crates.io/humantime/2.1.0 \
    crate://crates.io/indexmap/1.9.3 \
    crate://crates.io/io-lifetimes/1.0.11 \
    crate://crates.io/is-terminal/0.4.7 \
    crate://crates.io/itoa/1.0.6 \
    crate://crates.io/libc/0.2.146 \
    crate://crates.io/linux-raw-sys/0.3.8 \
    crate://crates.io/log/0.4.19 \
    crate://crates.io/memchr/2.5.0 \
    crate://crates.io/muldiv/1.0.1 \
    crate://crates.io/num-integer/0.1.45 \
    crate://crates.io/num-rational/0.4.1 \
    crate://crates.io/num-traits/0.2.15 \
    crate://crates.io/once_cell/1.18.0 \
    crate://crates.io/option-operations/0.5.0 \
    crate://crates.io/paste/1.0.12 \
    crate://crates.io/pin-project-lite/0.2.9 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.27 \
    crate://crates.io/pretty-hex/0.3.0 \
    crate://crates.io/proc-macro-crate/1.3.1 \
    crate://crates.io/proc-macro-error-attr/1.0.4 \
    crate://crates.io/proc-macro-error/1.0.4 \
    crate://crates.io/proc-macro2/1.0.60 \
    crate://crates.io/quote/1.0.28 \
    crate://crates.io/regex-syntax/0.7.2 \
    crate://crates.io/regex/1.8.4 \
    crate://crates.io/rustix/0.37.20 \
    crate://crates.io/ryu/1.0.13 \
    crate://crates.io/serde/1.0.164 \
    crate://crates.io/serde_derive/1.0.164 \
    crate://crates.io/serde_spanned/0.6.2 \
    crate://crates.io/serde_yaml/0.9.21 \
    crate://crates.io/slab/0.4.8 \
    crate://crates.io/smallvec/1.10.0 \
    crate://crates.io/strsim/0.10.0 \
    crate://crates.io/syn/1.0.109 \
    crate://crates.io/syn/2.0.18 \
    crate://crates.io/sysfs-pwm/0.1.0 \
    crate://crates.io/system-deps/6.1.0 \
    crate://crates.io/target-lexicon/0.12.7 \
    crate://crates.io/termcolor/1.2.0 \
    crate://crates.io/thiserror-impl/1.0.40 \
    crate://crates.io/thiserror/1.0.40 \
    crate://crates.io/toml/0.7.4 \
    crate://crates.io/toml_datetime/0.6.2 \
    crate://crates.io/toml_edit/0.19.10 \
    crate://crates.io/unicode-ident/1.0.9 \
    crate://crates.io/unsafe-libyaml/0.2.8 \
    crate://crates.io/utf8parse/0.2.1 \
    crate://crates.io/version-compare/0.1.1 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-sys/0.48.0 \
    crate://crates.io/windows-targets/0.48.0 \
    crate://crates.io/windows_aarch64_gnullvm/0.48.0 \
    crate://crates.io/windows_aarch64_msvc/0.48.0 \
    crate://crates.io/windows_i686_gnu/0.48.0 \
    crate://crates.io/windows_i686_msvc/0.48.0 \
    crate://crates.io/windows_x86_64_gnu/0.48.0 \
    crate://crates.io/windows_x86_64_gnullvm/0.48.0 \
    crate://crates.io/windows_x86_64_msvc/0.48.0 \
    crate://crates.io/winnow/0.4.7 \
"
#SRC_URI:append = "file://config.yaml"

DEPENDS:append = " pkgconfig-native gstreamer1.0"

# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    "

# do_install() {
#          install -d ${D}${ROOT_HOME}
#          install -m 0755 ${WORKDIR}/config.yaml ${D}${ROOT_HOME}
# }

#INSANE_SKIP_${PN}:append = "already-stripped"
#FILES:${PN} += "/usr/bin/*"
#FILES:${PN} += "/home/root/*"

SUMMARY = "mecha-device-test"
HOMEPAGE = "https://github.com/dhruveshb-mecha/mecha-device-test"
LICENSE = "CLOSED"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include mecha-device-test-${PV}.inc
include mecha-device-test.inc