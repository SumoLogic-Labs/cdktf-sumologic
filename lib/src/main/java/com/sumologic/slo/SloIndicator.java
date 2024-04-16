package com.sumologic.slo;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.208Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.slo.SloIndicator")
@software.amazon.jsii.Jsii.Proxy(SloIndicator.Jsii$Proxy.class)
public interface SloIndicator extends software.amazon.jsii.JsiiSerializable {

    /**
     * monitor_based_evaluation block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#monitor_based_evaluation Slo#monitor_based_evaluation}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.slo.SloIndicatorMonitorBasedEvaluation getMonitorBasedEvaluation() {
        return null;
    }

    /**
     * request_based_evaluation block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#request_based_evaluation Slo#request_based_evaluation}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.slo.SloIndicatorRequestBasedEvaluation getRequestBasedEvaluation() {
        return null;
    }

    /**
     * window_based_evaluation block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#window_based_evaluation Slo#window_based_evaluation}
     */
    default @org.jetbrains.annotations.Nullable com.sumologic.slo.SloIndicatorWindowBasedEvaluation getWindowBasedEvaluation() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link SloIndicator}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link SloIndicator}
     */
    public static final class Builder implements software.amazon.jsii.Builder<SloIndicator> {
        com.sumologic.slo.SloIndicatorMonitorBasedEvaluation monitorBasedEvaluation;
        com.sumologic.slo.SloIndicatorRequestBasedEvaluation requestBasedEvaluation;
        com.sumologic.slo.SloIndicatorWindowBasedEvaluation windowBasedEvaluation;

        /**
         * Sets the value of {@link SloIndicator#getMonitorBasedEvaluation}
         * @param monitorBasedEvaluation monitor_based_evaluation block.
         *                               Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#monitor_based_evaluation Slo#monitor_based_evaluation}
         * @return {@code this}
         */
        public Builder monitorBasedEvaluation(com.sumologic.slo.SloIndicatorMonitorBasedEvaluation monitorBasedEvaluation) {
            this.monitorBasedEvaluation = monitorBasedEvaluation;
            return this;
        }

        /**
         * Sets the value of {@link SloIndicator#getRequestBasedEvaluation}
         * @param requestBasedEvaluation request_based_evaluation block.
         *                               Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#request_based_evaluation Slo#request_based_evaluation}
         * @return {@code this}
         */
        public Builder requestBasedEvaluation(com.sumologic.slo.SloIndicatorRequestBasedEvaluation requestBasedEvaluation) {
            this.requestBasedEvaluation = requestBasedEvaluation;
            return this;
        }

        /**
         * Sets the value of {@link SloIndicator#getWindowBasedEvaluation}
         * @param windowBasedEvaluation window_based_evaluation block.
         *                              Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/slo#window_based_evaluation Slo#window_based_evaluation}
         * @return {@code this}
         */
        public Builder windowBasedEvaluation(com.sumologic.slo.SloIndicatorWindowBasedEvaluation windowBasedEvaluation) {
            this.windowBasedEvaluation = windowBasedEvaluation;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link SloIndicator}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public SloIndicator build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link SloIndicator}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements SloIndicator {
        private final com.sumologic.slo.SloIndicatorMonitorBasedEvaluation monitorBasedEvaluation;
        private final com.sumologic.slo.SloIndicatorRequestBasedEvaluation requestBasedEvaluation;
        private final com.sumologic.slo.SloIndicatorWindowBasedEvaluation windowBasedEvaluation;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.monitorBasedEvaluation = software.amazon.jsii.Kernel.get(this, "monitorBasedEvaluation", software.amazon.jsii.NativeType.forClass(com.sumologic.slo.SloIndicatorMonitorBasedEvaluation.class));
            this.requestBasedEvaluation = software.amazon.jsii.Kernel.get(this, "requestBasedEvaluation", software.amazon.jsii.NativeType.forClass(com.sumologic.slo.SloIndicatorRequestBasedEvaluation.class));
            this.windowBasedEvaluation = software.amazon.jsii.Kernel.get(this, "windowBasedEvaluation", software.amazon.jsii.NativeType.forClass(com.sumologic.slo.SloIndicatorWindowBasedEvaluation.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.monitorBasedEvaluation = builder.monitorBasedEvaluation;
            this.requestBasedEvaluation = builder.requestBasedEvaluation;
            this.windowBasedEvaluation = builder.windowBasedEvaluation;
        }

        @Override
        public final com.sumologic.slo.SloIndicatorMonitorBasedEvaluation getMonitorBasedEvaluation() {
            return this.monitorBasedEvaluation;
        }

        @Override
        public final com.sumologic.slo.SloIndicatorRequestBasedEvaluation getRequestBasedEvaluation() {
            return this.requestBasedEvaluation;
        }

        @Override
        public final com.sumologic.slo.SloIndicatorWindowBasedEvaluation getWindowBasedEvaluation() {
            return this.windowBasedEvaluation;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMonitorBasedEvaluation() != null) {
                data.set("monitorBasedEvaluation", om.valueToTree(this.getMonitorBasedEvaluation()));
            }
            if (this.getRequestBasedEvaluation() != null) {
                data.set("requestBasedEvaluation", om.valueToTree(this.getRequestBasedEvaluation()));
            }
            if (this.getWindowBasedEvaluation() != null) {
                data.set("windowBasedEvaluation", om.valueToTree(this.getWindowBasedEvaluation()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.slo.SloIndicator"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SloIndicator.Jsii$Proxy that = (SloIndicator.Jsii$Proxy) o;

            if (this.monitorBasedEvaluation != null ? !this.monitorBasedEvaluation.equals(that.monitorBasedEvaluation) : that.monitorBasedEvaluation != null) return false;
            if (this.requestBasedEvaluation != null ? !this.requestBasedEvaluation.equals(that.requestBasedEvaluation) : that.requestBasedEvaluation != null) return false;
            return this.windowBasedEvaluation != null ? this.windowBasedEvaluation.equals(that.windowBasedEvaluation) : that.windowBasedEvaluation == null;
        }

        @Override
        public final int hashCode() {
            int result = this.monitorBasedEvaluation != null ? this.monitorBasedEvaluation.hashCode() : 0;
            result = 31 * result + (this.requestBasedEvaluation != null ? this.requestBasedEvaluation.hashCode() : 0);
            result = 31 * result + (this.windowBasedEvaluation != null ? this.windowBasedEvaluation.hashCode() : 0);
            return result;
        }
    }
}
