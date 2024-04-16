package com.sumologic.cse_tag_schema;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.789Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.cseTagSchema.CseTagSchemaValueOptions")
@software.amazon.jsii.Jsii.Proxy(CseTagSchemaValueOptions.Jsii$Proxy.class)
public interface CseTagSchemaValueOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_tag_schema#value CseTagSchema#value}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getValue();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_tag_schema#label CseTagSchema#label}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLabel() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_tag_schema#link CseTagSchema#link}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getLink() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CseTagSchemaValueOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CseTagSchemaValueOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CseTagSchemaValueOptions> {
        java.lang.String value;
        java.lang.String label;
        java.lang.String link;

        /**
         * Sets the value of {@link CseTagSchemaValueOptions#getValue}
         * @param value Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_tag_schema#value CseTagSchema#value}. This parameter is required.
         * @return {@code this}
         */
        public Builder value(java.lang.String value) {
            this.value = value;
            return this;
        }

        /**
         * Sets the value of {@link CseTagSchemaValueOptions#getLabel}
         * @param label Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_tag_schema#label CseTagSchema#label}.
         * @return {@code this}
         */
        public Builder label(java.lang.String label) {
            this.label = label;
            return this;
        }

        /**
         * Sets the value of {@link CseTagSchemaValueOptions#getLink}
         * @param link Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_tag_schema#link CseTagSchema#link}.
         * @return {@code this}
         */
        public Builder link(java.lang.String link) {
            this.link = link;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CseTagSchemaValueOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CseTagSchemaValueOptions build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CseTagSchemaValueOptions}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CseTagSchemaValueOptions {
        private final java.lang.String value;
        private final java.lang.String label;
        private final java.lang.String link;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.value = software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.label = software.amazon.jsii.Kernel.get(this, "label", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.link = software.amazon.jsii.Kernel.get(this, "link", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.value = java.util.Objects.requireNonNull(builder.value, "value is required");
            this.label = builder.label;
            this.link = builder.link;
        }

        @Override
        public final java.lang.String getValue() {
            return this.value;
        }

        @Override
        public final java.lang.String getLabel() {
            return this.label;
        }

        @Override
        public final java.lang.String getLink() {
            return this.link;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("value", om.valueToTree(this.getValue()));
            if (this.getLabel() != null) {
                data.set("label", om.valueToTree(this.getLabel()));
            }
            if (this.getLink() != null) {
                data.set("link", om.valueToTree(this.getLink()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.cseTagSchema.CseTagSchemaValueOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CseTagSchemaValueOptions.Jsii$Proxy that = (CseTagSchemaValueOptions.Jsii$Proxy) o;

            if (!value.equals(that.value)) return false;
            if (this.label != null ? !this.label.equals(that.label) : that.label != null) return false;
            return this.link != null ? this.link.equals(that.link) : that.link == null;
        }

        @Override
        public final int hashCode() {
            int result = this.value.hashCode();
            result = 31 * result + (this.label != null ? this.label.hashCode() : 0);
            result = 31 * result + (this.link != null ? this.link.hashCode() : 0);
            return result;
        }
    }
}
