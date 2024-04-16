package com.sumologic.dashboard;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.883Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.dashboard.DashboardVariableSourceDefinitionMetadataVariableSourceDefinition")
@software.amazon.jsii.Jsii.Proxy(DashboardVariableSourceDefinitionMetadataVariableSourceDefinition.Jsii$Proxy.class)
public interface DashboardVariableSourceDefinitionMetadataVariableSourceDefinition extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#filter Dashboard#filter}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getFilter();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#key Dashboard#key}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getKey();

    /**
     * @return a {@link Builder} of {@link DashboardVariableSourceDefinitionMetadataVariableSourceDefinition}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DashboardVariableSourceDefinitionMetadataVariableSourceDefinition}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DashboardVariableSourceDefinitionMetadataVariableSourceDefinition> {
        java.lang.String filter;
        java.lang.String key;

        /**
         * Sets the value of {@link DashboardVariableSourceDefinitionMetadataVariableSourceDefinition#getFilter}
         * @param filter Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#filter Dashboard#filter}. This parameter is required.
         * @return {@code this}
         */
        public Builder filter(java.lang.String filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Sets the value of {@link DashboardVariableSourceDefinitionMetadataVariableSourceDefinition#getKey}
         * @param key Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/dashboard#key Dashboard#key}. This parameter is required.
         * @return {@code this}
         */
        public Builder key(java.lang.String key) {
            this.key = key;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DashboardVariableSourceDefinitionMetadataVariableSourceDefinition}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DashboardVariableSourceDefinitionMetadataVariableSourceDefinition build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link DashboardVariableSourceDefinitionMetadataVariableSourceDefinition}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DashboardVariableSourceDefinitionMetadataVariableSourceDefinition {
        private final java.lang.String filter;
        private final java.lang.String key;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.filter = software.amazon.jsii.Kernel.get(this, "filter", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.key = software.amazon.jsii.Kernel.get(this, "key", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.filter = java.util.Objects.requireNonNull(builder.filter, "filter is required");
            this.key = java.util.Objects.requireNonNull(builder.key, "key is required");
        }

        @Override
        public final java.lang.String getFilter() {
            return this.filter;
        }

        @Override
        public final java.lang.String getKey() {
            return this.key;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("filter", om.valueToTree(this.getFilter()));
            data.set("key", om.valueToTree(this.getKey()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.dashboard.DashboardVariableSourceDefinitionMetadataVariableSourceDefinition"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DashboardVariableSourceDefinitionMetadataVariableSourceDefinition.Jsii$Proxy that = (DashboardVariableSourceDefinitionMetadataVariableSourceDefinition.Jsii$Proxy) o;

            if (!filter.equals(that.filter)) return false;
            return this.key.equals(that.key);
        }

        @Override
        public final int hashCode() {
            int result = this.filter.hashCode();
            result = 31 * result + (this.key.hashCode());
            return result;
        }
    }
}
