package com.rfduino.core;

import android.bluetooth.BluetoothGatt;

import com.samsung.bluetoothle.BluetoothLENamespace;
/** RFDuinoSystemCharacteristics.java
 * 
 * List of UUIDs used by RFDuino devices to send and recieve BluetoothLE data. 
 * 
 * @author adrienne
 * 
 * This library is released under the LGPL. A copy of the license should have been distributed with this library/source code,
 * if not, you can read it here: (https://github.com/abolger/awesomesauce-rfduino/blob/master/LICENSE)
*/
public class RFDuinoSystemCharacteristics {
	//16 bit UUID custom RFDuino fields are turned into standard 128bit fields by following Bluetooth Base ID according to the BLE standard: 00000000-0000-1000-8000 00805F9B34FB
	
	//Service id to use to discover available services provided by the RFDuino hardware. Not to be confused with an Android "Service", which is used to run a long, ongoing process on the Android
	public static final String  BLE_GENERIC_ACCESS_PROFILE_UUID = BluetoothLENamespace.toUuid128StringFormat(0x1800) ;
	public static final String  BLE_GENERIC_ATTRIBUTE_PROFILE_UUID = BluetoothLENamespace.toUuid128StringFormat(0x1801);
	

	public static final String  RFDUINO_PROFILE_SERVICE_UUID = BluetoothLENamespace.toUuid128StringFormat(0x2220);
	public static final String  RFDUINO_PROFILE_SEND_UUID = BluetoothLENamespace.toUuid128StringFormat(0x2222);
	public static final String  RFDUINO_PROFILE_RECEIVE_UUID = BluetoothLENamespace.toUuid128StringFormat(0x2221);
	public static final String  RFDUINO_DISCONNECT_UUID = BluetoothLENamespace.toUuid128StringFormat(0x2223);

	public static final String RFDUINO_PROFILE_NOTIFICATION_UUID = BluetoothLENamespace.toUuid128StringFormat(0x2902);
		
}
