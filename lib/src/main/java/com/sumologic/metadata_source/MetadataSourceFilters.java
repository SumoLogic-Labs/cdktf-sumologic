package com.sumologic.metadata_source;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.099Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.metadataSource.MetadataSourceFilters")
@software.amazon.jsii.Jsii.Proxy(MetadataSourceFilters.Jsii$Proxy.class)
public interface MetadataSourceFilters extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#filter_type MetadataSource#filter_type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getFilterType();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#name MetadataSource#name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#regexp MetadataSource#regexp}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getRegexp();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#mask MetadataSource#mask}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMask() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MetadataSourceFilters}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MetadataSourceFilters}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MetadataSourceFilters> {
        java.lang.String filterType;
        java.lang.String name;
        java.lang.String regexp;
        java.lang.String mask;

        /**
         * Sets the value of {@link MetadataSourceFilters#getFilterType}
         * @param filterType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#filter_type MetadataSource#filter_type}. This parameter is required.
         * @return {@code this}
         */
        public Builder filterType(java.lang.String filterType) {
            this.filterType = filterType;
            return this;
        }

        /**
         * Sets the value of {@link MetadataSourceFilters#getName}
         * @param name Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#name MetadataSource#name}. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link MetadataSourceFilters#getRegexp}
         * @param regexp Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#regexp MetadataSource#regexp}. This parameter is required.
         * @return {@code this}
         */
        public Builder regexp(java.lang.String regexp) {
            this.regexp = regexp;
            return this;
        }

        /**
         * Sets the value of {@link MetadataSourceFilters#getMask}
         * @param mask Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#mask MetadataSource#mask}.
         * @return {@code this}
         */
        public Builder mask(java.lang.String mask) {
            this.mask = mask;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MetadataSourceFilters}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MetadataSourceFilters build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MetadataSourceFilters}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MetadataSourceFilters {
        private final java.lang.String filterType;
        private final java.lang.String name;
        private final java.lang.String regexp;
        private final java.lang.String mask;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.filterType = software.amazon.jsii.Kernel.get(this, "filterType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.regexp = software.amazon.jsii.Kernel.get(this, "regexp", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.mask = software.amazon.jsii.Kernel.get(this, "mask", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.filterType = java.util.Objects.requireNonNull(builder.filterType, "filterType is required");
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.regexp = java.util.Objects.requireNonNull(builder.regexp, "regexp is required");
            this.mask = builder.mask;
        }

        @Override
        public final java.lang.String getFilterType() {
            return this.filterType;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.lang.String getRegexp() {
            return this.regexp;
        }

        @Override
        public final java.lang.String getMask() {
            return this.mask;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("filterType", om.valueToTree(this.getFilterType()));
            data.set("name", om.valueToTree(this.getName()));
            data.set("regexp", om.valueToTree(this.getRegexp()));
            if (this.getMask() != null) {
                data.set("mask", om.valueToTree(this.getMask()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.metadataSource.MetadataSourceFilters"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MetadataSourceFilters.Jsii$Proxy that = (MetadataSourceFilters.Jsii$Proxy) o;

            if (!filterType.equals(that.filterType)) return false;
            if (!name.equals(that.name)) return false;
            if (!regexp.equals(that.regexp)) return false;
            return this.mask != null ? this.mask.equals(that.mask) : that.mask == null;
        }

        @Override
        public final int hashCode() {
            int result = this.filterType.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.regexp.hashCode());
            result = 31 * result + (this.mask != null ? this.mask.hashCode() : 0);
            return result;
        }
    }
}
