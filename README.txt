1 资源id 的查找路径：
  app/build/generate/source/r/debug/对应包名
2 注释代码：
   ctrl+ /         //注释代码行
   shift+ctrl+ /   /**/注释代码行

3 Android为蓝牙技术提供了4个工具类，分别是
  蓝牙适配器  BluetoothAdapter
  蓝牙设备    BluetoothDevice
  蓝牙服务端套接字   BluetoothServerSocket
  蓝牙客户端套接字   BluetoothSocket

  蓝牙适配器  BluetoothAdapter：（管理的是本机蓝牙设备）
  getDefaultAdapter：静态方法，获取默认的蓝牙适配器对象；
  enable：打开蓝牙功能；
  disable：关闭蓝牙功能；
  isEnable：判断蓝牙功能是否打开；
  startDiscovery：开始搜索周围的蓝牙设备；
  cancelDiscovery：取消搜索操作；
  isDiscovering：判断当前是否正在搜索设备；
  getBondedDevices：获取已绑定的设备列表；
  setName：设置本机的蓝牙名称；
  getName：获取本机的蓝牙名称；
  getAddress：获取本机的蓝牙地址；
  getRemoteDevice：根据蓝牙地址获取远程的蓝牙设备；
  getState：获取本地蓝牙适配器的状态；
  listenUsingRfcommWithServiceRecord：根据名称和UUID创建并返回BluetoothServiceSocket；
  listenUsingRfcommOn：根据渠道编号创建并返回BluetoothServiceSocket。

  蓝牙设备    BluetoothDevice（用于指代某个蓝牙设备，通常表示对方设备）
  getName：获得该设备的名称；
  getAddress：获得该设备的地址；
  getBondState：获得该设备的绑定状态；
  createBond：创建匹配对象；
  createRfcommSocketToServiceRecord：根据UUID创建并返回一个BluetoothSocket。

  BluetoothServiceSocket：
  （服务端的Socket，用来接收客户端的Socket连接请求）
  accept：监听外部的蓝牙连接请求；
  close：关闭服务端的蓝牙监听。

  BluetoothSocket：
  （客户端socket，用于与对方设备端数据通信）
  connect：建立蓝牙的socket连接；
  close：关闭蓝牙的socket连接；
  getInputStream：获取socket连接的输入流对象；
  getOutputStream：获取socket连接的输出流对象；
  getRemoteDevice：获取远程设备信息。


  1、