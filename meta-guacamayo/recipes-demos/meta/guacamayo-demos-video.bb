SUMMARY = "Demo Video Meta Package"
DESCRIPTION = "Demo Video Meta Package"
LICENSE = "MIT"

PR = "r1"

LIC_FILES_CHKSUM = "file://${THISDIR}/../../COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit allarch

ALLOW_EMPTY_${PN} = "1"

RDEPENDS_${PN} = "big-buck-bunny-trailer sintel-trailer"
