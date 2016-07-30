/**
 *  Recirculate On/Off Button Tile
 *
 */
metadata {
	// Automatically generated. Make future change here.
	definition (name: "Recirculate_Virtual_Switch", namespace: "midyear66", author: "bsanford") {
		capability "Switch"
	}

	// simulator metadata
	simulator {
	}

	// UI tile definitions
	tiles {
		standardTile("button", "device.switch", width: 2, height: 2, canChangeIcon: true) {
			state "off", label: 'Circulate', action: "switch.on", icon: "st.Appliances.appliances11", backgroundColor: "#ffffff", nextState: "on"
			state "on", label: 'Circulate', action: "switch.off", icon: "st.Appliances.appliances11", backgroundColor: "#79b821", nextState: "off"
		}
		main "button"
		details "button"
	}
}

def parse(String description) {
}

def on() {
	sendEvent(name: "switch", value: "on")
}

def off() {
	sendEvent(name: "switch", value: "off")
}

