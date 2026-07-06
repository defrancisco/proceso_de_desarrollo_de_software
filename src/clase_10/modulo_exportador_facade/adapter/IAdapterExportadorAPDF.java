package clase_10.modulo_exportador_facade.adapter;

import clase_10.modulo_exportador_facade.IExportable;

public interface IAdapterExportadorAPDF {
    String exportar(IExportable exportable);
}
