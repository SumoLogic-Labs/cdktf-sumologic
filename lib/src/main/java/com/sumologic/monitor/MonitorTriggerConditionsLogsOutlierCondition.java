package com.sumologic.monitor;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.118Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.monitor.MonitorTriggerConditionsLogsOutlierCondition")
@software.amazon.jsii.Jsii.Proxy(MonitorTriggerConditionsLogsOutlierCondition.Jsii$Proxy.class)
public interface MonitorTriggerConditionsLogsOutlierCondition extends software.amazon.jsii.JsiiSerializable {

    /**
     * critical block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#critical Monitor#critical}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsLogsOutlierConditionCritical getCritical() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#direction Monitor#direction}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDirection() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#field Monitor#field}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getField() {
        return null;
    }

    /**
     * warning block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#warning Monitor#warning}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.monitor.MonitorTriggerConditionsLogsOutlierConditionWarning getWarning() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MonitorTriggerConditionsLogsOutlierCondition}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MonitorTriggerConditionsLogsOutlierCondition}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MonitorTriggerConditionsLogsOutlierCondition> {
        com.sumologic.monitor.MonitorTriggerConditionsLogsOutlierConditionCritical critical;
        java.lang.String direction;
        java.lang.String field;
        com.sumologic.monitor.MonitorTriggerConditionsLogsOutlierConditionWarning warning;

        /**
         * Sets the value of {@link MonitorTriggerConditionsLogsOutlierCondition#getCritical}
         * @param critical critical block.
         *                 Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#critical Monitor#critical}
         * @return {@code this}
         */
        public Builder critical(com.sumologic.monitor.MonitorTriggerConditionsLogsOutlierConditionCritical critical) {
            this.critical = critical;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggerConditionsLogsOutlierCondition#getDirection}
         * @param direction Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#direction Monitor#direction}.
         * @return {@code this}
         */
        public Builder direction(java.lang.String direction) {
            this.direction = direction;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggerConditionsLogsOutlierCondition#getField}
         * @param field Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#field Monitor#field}.
         * @return {@code this}
         */
        public Builder field(java.lang.String field) {
            this.field = field;
            return this;
        }

        /**
         * Sets the value of {@link MonitorTriggerConditionsLogsOutlierCondition#getWarning}
         * @param warning warning block.
         *                Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/monitor#warning Monitor#warning}
         * @return {@code this}
         */
        public Builder warning(com.sumologic.monitor.MonitorTriggerConditionsLogsOutlierConditionWarning warning) {
            this.warning = warning;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MonitorTriggerConditionsLogsOutlierCondition}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MonitorTriggerConditionsLogsOutlierCondition build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MonitorTriggerConditionsLogsOutlierCondition}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MonitorTriggerConditionsLogsOutlierCondition {
        private final com.sumologic.monitor.MonitorTriggerConditionsLogsOutlierConditionCritical critical;
        private final java.lang.String direction;
        private final java.lang.String field;
        private final com.sumologic.monitor.MonitorTriggerConditionsLogsOutlierConditionWarning warning;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.critical = software.amazon.jsii.Kernel.get(this, "critical", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsLogsOutlierConditionCritical.class));
            this.direction = software.amazon.jsii.Kernel.get(this, "direction", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.field = software.amazon.jsii.Kernel.get(this, "field", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.warning = software.amazon.jsii.Kernel.get(this, "warning", software.amazon.jsii.NativeType.forClass(com.sumologic.monitor.MonitorTriggerConditionsLogsOutlierConditionWarning.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.critical = builder.critical;
            this.direction = builder.direction;
            this.field = builder.field;
            this.warning = builder.warning;
        }

        @Override
        public final com.sumologic.monitor.MonitorTriggerConditionsLogsOutlierConditionCritical getCritical() {
            return this.critical;
        }

        @Override
        public final java.lang.String getDirection() {
            return this.direction;
        }

        @Override
        public final java.lang.String getField() {
            return this.field;
        }

        @Override
        public final com.sumologic.monitor.MonitorTriggerConditionsLogsOutlierConditionWarning getWarning() {
            return this.warning;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getCritical() != null) {
                data.set("critical", om.valueToTree(this.getCritical()));
            }
            if (this.getDirection() != null) {
                data.set("direction", om.valueToTree(this.getDirection()));
            }
            if (this.getField() != null) {
                data.set("field", om.valueToTree(this.getField()));
            }
            if (this.getWarning() != null) {
                data.set("warning", om.valueToTree(this.getWarning()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.monitor.MonitorTriggerConditionsLogsOutlierCondition"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MonitorTriggerConditionsLogsOutlierCondition.Jsii$Proxy that = (MonitorTriggerConditionsLogsOutlierCondition.Jsii$Proxy) o;

            if (this.critical != null ? !this.critical.equals(that.critical) : that.critical != null) return false;
            if (this.direction != null ? !this.direction.equals(that.direction) : that.direction != null) return false;
            if (this.field != null ? !this.field.equals(that.field) : that.field != null) return false;
            return this.warning != null ? this.warning.equals(that.warning) : that.warning == null;
        }

        @Override
        public final int hashCode() {
            int result = this.critical != null ? this.critical.hashCode() : 0;
            result = 31 * result + (this.direction != null ? this.direction.hashCode() : 0);
            result = 31 * result + (this.field != null ? this.field.hashCode() : 0);
            result = 31 * result + (this.warning != null ? this.warning.hashCode() : 0);
            return result;
        }
    }
}
