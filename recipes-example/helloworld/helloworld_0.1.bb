SUMMARY = "Hello World Program"

# License information 
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://helloworld.c"

TARGET_CC_ARCH += "${LDFLAGS}"

S = "${WORKDIR}"

do_compile() {
        ${CC} -Wall helloworld.c -o helloworld
}

do_install() {
        install -d ${D}${bindir}
        install -m 0755 ${S}/helloworld ${D}${bindir}
}

FILES_${PN} += "/helloworld"

