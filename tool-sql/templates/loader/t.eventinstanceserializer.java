        for ( IEvent $l{self.class_name}_inst : population.getRunContext().getActiveEvents().where(selected -> selected instanceof ${class_name}) ) serialize_${self.class_name}( (${class_name})$l{self.class_name}_inst, out );
