package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.845Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardPanelSumoSearchPanelQueryMetricsQueryDataFilter")
@software.amazon.jsii.Jsii.Proxy(DashboardPanelSumoSearchPanelQueryMetricsQueryDataFilter.Jsii$Proxy.class)
public interface DashboardPanelSumoSearchPanelQueryMetricsQueryDataFilter extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#key Dashboard#key}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getKey();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#value Dashboard#value}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getValue();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#negation Dashboard#negation}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getNegation() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DashboardPanelSumoSearchPanelQueryMetricsQueryDataFilter}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DashboardPanelSumoSearchPanelQueryMetricsQueryDataFilter}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DashboardPanelSumoSearchPanelQueryMetricsQueryDataFilter> {
        java.lang.String key;
        java.lang.String value;
        java.lang.Object negation;

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanelQueryMetricsQueryDataFilter#getKey}
         * @param key Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#key Dashboard#key}. This parameter is required.
         * @return {@code this}
         */
        public Builder key(java.lang.String key) {
            this.key = key;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanelQueryMetricsQueryDataFilter#getValue}
         * @param value Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#value Dashboard#value}. This parameter is required.
         * @return {@code this}
         */
        public Builder value(java.lang.String value) {
            this.value = value;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanelQueryMetricsQueryDataFilter#getNegation}
         * @param negation Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#negation Dashboard#negation}.
         * @return {@code this}
         */
        public Builder negation(java.lang.Boolean negation) {
            this.negation = negation;
            return this;
        }

        /**
         * Sets the value of {@link DashboardPanelSumoSearchPanelQueryMetricsQueryDataFilter#getNegation}
         * @param negation Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#negation Dashboard#negation}.
         * @return {@code this}
         */
        public Builder negation(com.hashicorp.cdktf.IResolvable negation) {
            this.negation = negation;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DashboardPanelSumoSearchPanelQueryMetricsQueryDataFilter}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DashboardPanelSumoSearchPanelQueryMetricsQueryDataFilter build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DashboardPanelSumoSearchPanelQueryMetricsQueryDataFilter}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DashboardPanelSumoSearchPanelQueryMetricsQueryDataFilter {
        private final java.lang.String key;
        private final java.lang.String value;
        private final java.lang.Object negation;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.key = software.amazon.jsii.Kernel.get(this, "key", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.value = software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.negation = software.amazon.jsii.Kernel.get(this, "negation", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.key = java.util.Objects.requireNonNull(builder.key, "key is required");
            this.value = java.util.Objects.requireNonNull(builder.value, "value is required");
            this.negation = builder.negation;
        }

        @Override
        public final java.lang.String getKey() {
            return this.key;
        }

        @Override
        public final java.lang.String getValue() {
            return this.value;
        }

        @Override
        public final java.lang.Object getNegation() {
            return this.negation;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("key", om.valueToTree(this.getKey()));
            data.set("value", om.valueToTree(this.getValue()));
            if (this.getNegation() != null) {
                data.set("negation", om.valueToTree(this.getNegation()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.dashboard.DashboardPanelSumoSearchPanelQueryMetricsQueryDataFilter"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DashboardPanelSumoSearchPanelQueryMetricsQueryDataFilter.Jsii$Proxy that = (DashboardPanelSumoSearchPanelQueryMetricsQueryDataFilter.Jsii$Proxy) o;

            if (!key.equals(that.key)) return false;
            if (!value.equals(that.value)) return false;
            return this.negation != null ? this.negation.equals(that.negation) : that.negation == null;
        }

        @Override
        public final int hashCode() {
            int result = this.key.hashCode();
            result = 31 * result + (this.value.hashCode());
            result = 31 * result + (this.negation != null ? this.negation.hashCode() : 0);
            return result;
        }
    }
}
