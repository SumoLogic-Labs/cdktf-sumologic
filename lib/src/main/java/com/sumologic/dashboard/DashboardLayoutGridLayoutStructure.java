package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.820Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardLayoutGridLayoutStructure")
@software.amazon.jsii.Jsii.Proxy(DashboardLayoutGridLayoutStructure.Jsii$Proxy.class)
public interface DashboardLayoutGridLayoutStructure extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#key Dashboard#key}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getKey();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#structure Dashboard#structure}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getStructure();

    /**
     * @return a {@link Builder} of {@link DashboardLayoutGridLayoutStructure}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DashboardLayoutGridLayoutStructure}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DashboardLayoutGridLayoutStructure> {
        java.lang.String key;
        java.lang.String structure;

        /**
         * Sets the value of {@link DashboardLayoutGridLayoutStructure#getKey}
         * @param key Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#key Dashboard#key}. This parameter is required.
         * @return {@code this}
         */
        public Builder key(java.lang.String key) {
            this.key = key;
            return this;
        }

        /**
         * Sets the value of {@link DashboardLayoutGridLayoutStructure#getStructure}
         * @param structure Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#structure Dashboard#structure}. This parameter is required.
         * @return {@code this}
         */
        public Builder structure(java.lang.String structure) {
            this.structure = structure;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DashboardLayoutGridLayoutStructure}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DashboardLayoutGridLayoutStructure build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DashboardLayoutGridLayoutStructure}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DashboardLayoutGridLayoutStructure {
        private final java.lang.String key;
        private final java.lang.String structure;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.key = software.amazon.jsii.Kernel.get(this, "key", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.structure = software.amazon.jsii.Kernel.get(this, "structure", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.key = java.util.Objects.requireNonNull(builder.key, "key is required");
            this.structure = java.util.Objects.requireNonNull(builder.structure, "structure is required");
        }

        @Override
        public final java.lang.String getKey() {
            return this.key;
        }

        @Override
        public final java.lang.String getStructure() {
            return this.structure;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("key", om.valueToTree(this.getKey()));
            data.set("structure", om.valueToTree(this.getStructure()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.dashboard.DashboardLayoutGridLayoutStructure"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DashboardLayoutGridLayoutStructure.Jsii$Proxy that = (DashboardLayoutGridLayoutStructure.Jsii$Proxy) o;

            if (!key.equals(that.key)) return false;
            return this.structure.equals(that.structure);
        }

        @Override
        public final int hashCode() {
            int result = this.key.hashCode();
            result = 31 * result + (this.structure.hashCode());
            return result;
        }
    }
}
