package clase_10.modulo_exportador_facade.strategy;

import clase_10.modulo_exportador_facade.IExportable;

public interface IEstrategiaDeExportacion {
    String exportar(IExportable exportable);
}
