package com.sumologic.slo;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.209Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.slo.SloIndicatorMonitorBasedEvaluationMonitorTriggers")
@software.amazon.jsii.Jsii.Proxy(SloIndicatorMonitorBasedEvaluationMonitorTriggers.Jsii$Proxy.class)
public interface SloIndicatorMonitorBasedEvaluationMonitorTriggers extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#monitor_id Slo#monitor_id}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getMonitorId();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#trigger_types Slo#trigger_types}.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getTriggerTypes();

    /**
     * @return a {@link Builder} of {@link SloIndicatorMonitorBasedEvaluationMonitorTriggers}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SloIndicatorMonitorBasedEvaluationMonitorTriggers}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SloIndicatorMonitorBasedEvaluationMonitorTriggers> {
        java.lang.String monitorId;
        java.util.List<java.lang.String> triggerTypes;

        /**
         * Sets the value of {@link SloIndicatorMonitorBasedEvaluationMonitorTriggers#getMonitorId}
         * @param monitorId Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#monitor_id Slo#monitor_id}. This parameter is required.
         * @return {@code this}
         */
        public Builder monitorId(java.lang.String monitorId) {
            this.monitorId = monitorId;
            return this;
        }

        /**
         * Sets the value of {@link SloIndicatorMonitorBasedEvaluationMonitorTriggers#getTriggerTypes}
         * @param triggerTypes Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#trigger_types Slo#trigger_types}. This parameter is required.
         * @return {@code this}
         */
        public Builder triggerTypes(java.util.List<java.lang.String> triggerTypes) {
            this.triggerTypes = triggerTypes;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SloIndicatorMonitorBasedEvaluationMonitorTriggers}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SloIndicatorMonitorBasedEvaluationMonitorTriggers build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SloIndicatorMonitorBasedEvaluationMonitorTriggers}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SloIndicatorMonitorBasedEvaluationMonitorTriggers {
        private final java.lang.String monitorId;
        private final java.util.List<java.lang.String> triggerTypes;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.monitorId = software.amazon.jsii.Kernel.get(this, "monitorId", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.triggerTypes = software.amazon.jsii.Kernel.get(this, "triggerTypes", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.monitorId = java.util.Objects.requireNonNull(builder.monitorId, "monitorId is required");
            this.triggerTypes = java.util.Objects.requireNonNull(builder.triggerTypes, "triggerTypes is required");
        }

        @Override
        public final java.lang.String getMonitorId() {
            return this.monitorId;
        }

        @Override
        public final java.util.List<java.lang.String> getTriggerTypes() {
            return this.triggerTypes;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("monitorId", om.valueToTree(this.getMonitorId()));
            data.set("triggerTypes", om.valueToTree(this.getTriggerTypes()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.slo.SloIndicatorMonitorBasedEvaluationMonitorTriggers"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SloIndicatorMonitorBasedEvaluationMonitorTriggers.Jsii$Proxy that = (SloIndicatorMonitorBasedEvaluationMonitorTriggers.Jsii$Proxy) o;

            if (!monitorId.equals(that.monitorId)) return false;
            return this.triggerTypes.equals(that.triggerTypes);
        }

        @Override
        public final int hashCode() {
            int result = this.monitorId.hashCode();
            result = 31 * result + (this.triggerTypes.hashCode());
            return result;
        }
    }
}
