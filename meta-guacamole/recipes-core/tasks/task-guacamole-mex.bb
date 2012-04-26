DESCRIPTION="Guacamole task for MEX"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${GUACABASE}/meta-guacamole/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

PR = "r0"

PACKAGES="\
	task-guacamole-mex \
	task-guacamole-gles-tests \
	"

ALLOW_EMPTY = "1"

RDEPENDS_task-guacamole-mex = "\
			      clutter-1.10 \
			      clutter-gst-1.10	    \
			      clutter-gst-1.10-examples \
			      "

RDEPENDS_task-guacamole-gles-tests_beagleboard = "\
					       	  libgles-omap3-rawdemos \
						  clutter-1.10-examples \
					         "