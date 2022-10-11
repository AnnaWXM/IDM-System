package IDM;

public class CSIAdapter implements IDMInterface{
    CSI csi;

    public CSIAdapter(CSI csi){
        this.csi = csi;
    }

    public void list(){
        csi.list();
    }
}
