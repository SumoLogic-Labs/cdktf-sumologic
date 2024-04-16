package com.sumologic.polling_source;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:25.146Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.pollingSource.PollingSourcePath")
@software.amazon.jsii.Jsii.Proxy(PollingSourcePath.Jsii$Proxy.class)
public interface PollingSourcePath extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/polling_source#type PollingSource#type}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getType();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/polling_source#bucket_name PollingSource#bucket_name}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getBucketName() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/polling_source#limit_to_namespaces PollingSource#limit_to_namespaces}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLimitToNamespaces() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/polling_source#limit_to_regions PollingSource#limit_to_regions}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getLimitToRegions() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/polling_source#path_expression PollingSource#path_expression}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPathExpression() {
        return null;
    }

    /**
     * tag_filters block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/polling_source#tag_filters PollingSource#tag_filters}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getTagFilters() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PollingSourcePath}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PollingSourcePath}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PollingSourcePath> {
        java.lang.String type;
        java.lang.String bucketName;
        java.util.List<java.lang.String> limitToNamespaces;
        java.util.List<java.lang.String> limitToRegions;
        java.lang.String pathExpression;
        java.lang.Object tagFilters;

        /**
         * Sets the value of {@link PollingSourcePath#getType}
         * @param type Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/polling_source#type PollingSource#type}. This parameter is required.
         * @return {@code this}
         */
        public Builder type(java.lang.String type) {
            this.type = type;
            return this;
        }

        /**
         * Sets the value of {@link PollingSourcePath#getBucketName}
         * @param bucketName Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/polling_source#bucket_name PollingSource#bucket_name}.
         * @return {@code this}
         */
        public Builder bucketName(java.lang.String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        /**
         * Sets the value of {@link PollingSourcePath#getLimitToNamespaces}
         * @param limitToNamespaces Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/polling_source#limit_to_namespaces PollingSource#limit_to_namespaces}.
         * @return {@code this}
         */
        public Builder limitToNamespaces(java.util.List<java.lang.String> limitToNamespaces) {
            this.limitToNamespaces = limitToNamespaces;
            return this;
        }

        /**
         * Sets the value of {@link PollingSourcePath#getLimitToRegions}
         * @param limitToRegions Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/polling_source#limit_to_regions PollingSource#limit_to_regions}.
         * @return {@code this}
         */
        public Builder limitToRegions(java.util.List<java.lang.String> limitToRegions) {
            this.limitToRegions = limitToRegions;
            return this;
        }

        /**
         * Sets the value of {@link PollingSourcePath#getPathExpression}
         * @param pathExpression Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/polling_source#path_expression PollingSource#path_expression}.
         * @return {@code this}
         */
        public Builder pathExpression(java.lang.String pathExpression) {
            this.pathExpression = pathExpression;
            return this;
        }

        /**
         * Sets the value of {@link PollingSourcePath#getTagFilters}
         * @param tagFilters tag_filters block.
         *                   Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/polling_source#tag_filters PollingSource#tag_filters}
         * @return {@code this}
         */
        public Builder tagFilters(com.hashicorp.cdktf.IResolvable tagFilters) {
            this.tagFilters = tagFilters;
            return this;
        }

        /**
         * Sets the value of {@link PollingSourcePath#getTagFilters}
         * @param tagFilters tag_filters block.
         *                   Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/polling_source#tag_filters PollingSource#tag_filters}
         * @return {@code this}
         */
        public Builder tagFilters(java.util.List<? extends com.sumologic.polling_source.PollingSourcePathTagFilters> tagFilters) {
            this.tagFilters = tagFilters;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PollingSourcePath}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PollingSourcePath build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link PollingSourcePath}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PollingSourcePath {
        private final java.lang.String type;
        private final java.lang.String bucketName;
        private final java.util.List<java.lang.String> limitToNamespaces;
        private final java.util.List<java.lang.String> limitToRegions;
        private final java.lang.String pathExpression;
        private final java.lang.Object tagFilters;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.type = software.amazon.jsii.Kernel.get(this, "type", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.bucketName = software.amazon.jsii.Kernel.get(this, "bucketName", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.limitToNamespaces = software.amazon.jsii.Kernel.get(this, "limitToNamespaces", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.limitToRegions = software.amazon.jsii.Kernel.get(this, "limitToRegions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.pathExpression = software.amazon.jsii.Kernel.get(this, "pathExpression", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.tagFilters = software.amazon.jsii.Kernel.get(this, "tagFilters", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.type = java.util.Objects.requireNonNull(builder.type, "type is required");
            this.bucketName = builder.bucketName;
            this.limitToNamespaces = builder.limitToNamespaces;
            this.limitToRegions = builder.limitToRegions;
            this.pathExpression = builder.pathExpression;
            this.tagFilters = builder.tagFilters;
        }

        @Override
        public final java.lang.String getType() {
            return this.type;
        }

        @Override
        public final java.lang.String getBucketName() {
            return this.bucketName;
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
        public final java.lang.String getPathExpression() {
            return this.pathExpression;
        }

        @Override
        public final java.lang.Object getTagFilters() {
            return this.tagFilters;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("type", om.valueToTree(this.getType()));
            if (this.getBucketName() != null) {
                data.set("bucketName", om.valueToTree(this.getBucketName()));
            }
            if (this.getLimitToNamespaces() != null) {
                data.set("limitToNamespaces", om.valueToTree(this.getLimitToNamespaces()));
            }
            if (this.getLimitToRegions() != null) {
                data.set("limitToRegions", om.valueToTree(this.getLimitToRegions()));
            }
            if (this.getPathExpression() != null) {
                data.set("pathExpression", om.valueToTree(this.getPathExpression()));
            }
            if (this.getTagFilters() != null) {
                data.set("tagFilters", om.valueToTree(this.getTagFilters()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.pollingSource.PollingSourcePath"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PollingSourcePath.Jsii$Proxy that = (PollingSourcePath.Jsii$Proxy) o;

            if (!type.equals(that.type)) return false;
            if (this.bucketName != null ? !this.bucketName.equals(that.bucketName) : that.bucketName != null) return false;
            if (this.limitToNamespaces != null ? !this.limitToNamespaces.equals(that.limitToNamespaces) : that.limitToNamespaces != null) return false;
            if (this.limitToRegions != null ? !this.limitToRegions.equals(that.limitToRegions) : that.limitToRegions != null) return false;
            if (this.pathExpression != null ? !this.pathExpression.equals(that.pathExpression) : that.pathExpression != null) return false;
            return this.tagFilters != null ? this.tagFilters.equals(that.tagFilters) : that.tagFilters == null;
        }

        @Override
        public final int hashCode() {
            int result = this.type.hashCode();
            result = 31 * result + (this.bucketName != null ? this.bucketName.hashCode() : 0);
            result = 31 * result + (this.limitToNamespaces != null ? this.limitToNamespaces.hashCode() : 0);
            result = 31 * result + (this.limitToRegions != null ? this.limitToRegions.hashCode() : 0);
            result = 31 * result + (this.pathExpression != null ? this.pathExpression.hashCode() : 0);
            result = 31 * result + (this.tagFilters != null ? this.tagFilters.hashCode() : 0);
            return result;
        }
    }
}
