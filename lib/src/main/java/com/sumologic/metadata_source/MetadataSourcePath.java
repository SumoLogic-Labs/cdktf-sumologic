package com.sumologic.metadata_source;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.099Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.metadataSource.MetadataSourcePath")
@software.amazon.jsii.Jsii.Proxy(MetadataSourcePath.Jsii$Proxy.class)
public interface MetadataSourcePath extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#type MetadataSource#type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#limit_to_namespaces MetadataSource#limit_to_namespaces}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLimitToNamespaces() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#limit_to_regions MetadataSource#limit_to_regions}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLimitToRegions() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#tag_filters MetadataSource#tag_filters}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getTagFilters() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MetadataSourcePath}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MetadataSourcePath}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MetadataSourcePath> {
        java.lang.String type;
        java.util.List<java.lang.String> limitToNamespaces;
        java.util.List<java.lang.String> limitToRegions;
        java.util.List<java.lang.String> tagFilters;

        /**
         * Sets the value of {@link MetadataSourcePath#getType}
         * @param type Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#type MetadataSource#type}. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link MetadataSourcePath#getLimitToNamespaces}
         * @param limitToNamespaces Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#limit_to_namespaces MetadataSource#limit_to_namespaces}.
         * @return {@code this}
         */
        public Builder limitToNamespaces(java.util.List<java.lang.String> limitToNamespaces) {
            this.limitToNamespaces = limitToNamespaces;
            return this;
        }

        /**
         * Sets the value of {@link MetadataSourcePath#getLimitToRegions}
         * @param limitToRegions Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#limit_to_regions MetadataSource#limit_to_regions}.
         * @return {@code this}
         */
        public Builder limitToRegions(java.util.List<java.lang.String> limitToRegions) {
            this.limitToRegions = limitToRegions;
            return this;
        }

        /**
         * Sets the value of {@link MetadataSourcePath#getTagFilters}
         * @param tagFilters Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/metadata_source#tag_filters MetadataSource#tag_filters}.
         * @return {@code this}
         */
        public Builder tagFilters(java.util.List<java.lang.String> tagFilters) {
            this.tagFilters = tagFilters;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MetadataSourcePath}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MetadataSourcePath build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link MetadataSourcePath}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MetadataSourcePath {
        private final java.lang.String type;
        private final java.util.List<java.lang.String> limitToNamespaces;
        private final java.util.List<java.lang.String> limitToRegions;
        private final java.util.List<java.lang.String> tagFilters;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.limitToNamespaces = software.amazon.jsii.Kernel.get(this, "limitToNamespaces", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.limitToRegions = software.amazon.jsii.Kernel.get(this, "limitToRegions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.tagFilters = software.amazon.jsii.Kernel.get(this, "tagFilters", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
            this.limitToNamespaces = builder.limitToNamespaces;
            this.limitToRegions = builder.limitToRegions;
            this.tagFilters = builder.tagFilters;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.util.List<java.lang.String> getLimitToNamespaces() {
            return this.limitToNamespaces;
        }

        @Override
        public final java.util.List<java.lang.String> getLimitToRegions() {
            return this.limitToRegions;
        }

        @Override
        public final java.util.List<java.lang.String> getTagFilters() {
            return this.tagFilters;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("type", om.valueToTree(this.getType()));
            if (this.getLimitToNamespaces() != null) {
                data.set("limitToNamespaces", om.valueToTree(this.getLimitToNamespaces()));
            }
            if (this.getLimitToRegions() != null) {
                data.set("limitToRegions", om.valueToTree(this.getLimitToRegions()));
            }
            if (this.getTagFilters() != null) {
                data.set("tagFilters", om.valueToTree(this.getTagFilters()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.metadataSource.MetadataSourcePath"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MetadataSourcePath.Jsii$Proxy that = (MetadataSourcePath.Jsii$Proxy) o;

            if (!type.equals(that.type)) return false;
            if (this.limitToNamespaces != null ? !this.limitToNamespaces.equals(that.limitToNamespaces) : that.limitToNamespaces != null) return false;
            if (this.limitToRegions != null ? !this.limitToRegions.equals(that.limitToRegions) : that.limitToRegions != null) return false;
            return this.tagFilters != null ? this.tagFilters.equals(that.tagFilters) : that.tagFilters == null;
        }

        @Override
        public final int hashCode() {
            int result = this.type.hashCode();
            result = 31 * result + (this.limitToNamespaces != null ? this.limitToNamespaces.hashCode() : 0);
            result = 31 * result + (this.limitToRegions != null ? this.limitToRegions.hashCode() : 0);
            result = 31 * result + (this.tagFilters != null ? this.tagFilters.hashCode() : 0);
            return result;
        }
    }
}
