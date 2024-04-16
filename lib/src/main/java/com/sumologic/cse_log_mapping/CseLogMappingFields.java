package com.sumologic.cse_log_mapping;

@javax.annotation.Generated(value = "jsii-pacmak/1.95.0 (build f1ff514)", date = "2024-04-16T12:34:24.746Z")
@software.amazon.jsii.Jsii(module = com.sumologic.$Module.class, fqn = "sumologic.cseLogMapping.CseLogMappingFields")
@software.amazon.jsii.Jsii.Proxy(CseLogMappingFields.Jsii$Proxy.class)
public interface CseLogMappingFields extends software.amazon.jsii.JsiiSerializable {

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#name CseLogMapping#name}.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#alternate_values CseLogMapping#alternate_values}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAlternateValues() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#case_insensitive CseLogMapping#case_insensitive}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getCaseInsensitive() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#default_value CseLogMapping#default_value}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getDefaultValue() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#field_join CseLogMapping#field_join}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getFieldJoin() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#format CseLogMapping#format}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFormat() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#format_parameters CseLogMapping#format_parameters}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getFormatParameters() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#join_delimiter CseLogMapping#join_delimiter}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getJoinDelimiter() {
        return null;
    }

    /**
     * lookup block.
     * <p>
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#lookup CseLogMapping#lookup}
     */
    default @org.jetbrains.annotations.Nullable java.lang.Object getLookup() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#skipped_values CseLogMapping#skipped_values}.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getSkippedValues() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#split_delimiter CseLogMapping#split_delimiter}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSplitDelimiter() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#split_index CseLogMapping#split_index}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getSplitIndex() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#time_zone CseLogMapping#time_zone}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getTimeZone() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#value CseLogMapping#value}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getValue() {
        return null;
    }

    /**
     * Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#value_type CseLogMapping#value_type}.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getValueType() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CseLogMappingFields}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CseLogMappingFields}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CseLogMappingFields> {
        java.lang.String name;
        java.util.List<java.lang.String> alternateValues;
        java.lang.Object caseInsensitive;
        java.lang.String defaultValue;
        java.util.List<java.lang.String> fieldJoin;
        java.lang.String format;
        java.util.List<java.lang.String> formatParameters;
        java.lang.String joinDelimiter;
        java.lang.Object lookup;
        java.util.List<java.lang.String> skippedValues;
        java.lang.String splitDelimiter;
        java.lang.Number splitIndex;
        java.lang.String timeZone;
        java.lang.String value;
        java.lang.String valueType;

        /**
         * Sets the value of {@link CseLogMappingFields#getName}
         * @param name Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#name CseLogMapping#name}. This parameter is required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingFields#getAlternateValues}
         * @param alternateValues Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#alternate_values CseLogMapping#alternate_values}.
         * @return {@code this}
         */
        public Builder alternateValues(java.util.List<java.lang.String> alternateValues) {
            this.alternateValues = alternateValues;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingFields#getCaseInsensitive}
         * @param caseInsensitive Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#case_insensitive CseLogMapping#case_insensitive}.
         * @return {@code this}
         */
        public Builder caseInsensitive(java.lang.Boolean caseInsensitive) {
            this.caseInsensitive = caseInsensitive;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingFields#getCaseInsensitive}
         * @param caseInsensitive Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#case_insensitive CseLogMapping#case_insensitive}.
         * @return {@code this}
         */
        public Builder caseInsensitive(com.hashicorp.cdktf.IResolvable caseInsensitive) {
            this.caseInsensitive = caseInsensitive;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingFields#getDefaultValue}
         * @param defaultValue Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#default_value CseLogMapping#default_value}.
         * @return {@code this}
         */
        public Builder defaultValue(java.lang.String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingFields#getFieldJoin}
         * @param fieldJoin Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#field_join CseLogMapping#field_join}.
         * @return {@code this}
         */
        public Builder fieldJoin(java.util.List<java.lang.String> fieldJoin) {
            this.fieldJoin = fieldJoin;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingFields#getFormat}
         * @param format Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#format CseLogMapping#format}.
         * @return {@code this}
         */
        public Builder format(java.lang.String format) {
            this.format = format;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingFields#getFormatParameters}
         * @param formatParameters Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#format_parameters CseLogMapping#format_parameters}.
         * @return {@code this}
         */
        public Builder formatParameters(java.util.List<java.lang.String> formatParameters) {
            this.formatParameters = formatParameters;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingFields#getJoinDelimiter}
         * @param joinDelimiter Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#join_delimiter CseLogMapping#join_delimiter}.
         * @return {@code this}
         */
        public Builder joinDelimiter(java.lang.String joinDelimiter) {
            this.joinDelimiter = joinDelimiter;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingFields#getLookup}
         * @param lookup lookup block.
         *               Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#lookup CseLogMapping#lookup}
         * @return {@code this}
         */
        public Builder lookup(com.hashicorp.cdktf.IResolvable lookup) {
            this.lookup = lookup;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingFields#getLookup}
         * @param lookup lookup block.
         *               Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#lookup CseLogMapping#lookup}
         * @return {@code this}
         */
        public Builder lookup(java.util.List<? extends com.sumologic.cse_log_mapping.CseLogMappingFieldsLookup> lookup) {
            this.lookup = lookup;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingFields#getSkippedValues}
         * @param skippedValues Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#skipped_values CseLogMapping#skipped_values}.
         * @return {@code this}
         */
        public Builder skippedValues(java.util.List<java.lang.String> skippedValues) {
            this.skippedValues = skippedValues;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingFields#getSplitDelimiter}
         * @param splitDelimiter Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#split_delimiter CseLogMapping#split_delimiter}.
         * @return {@code this}
         */
        public Builder splitDelimiter(java.lang.String splitDelimiter) {
            this.splitDelimiter = splitDelimiter;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingFields#getSplitIndex}
         * @param splitIndex Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#split_index CseLogMapping#split_index}.
         * @return {@code this}
         */
        public Builder splitIndex(java.lang.Number splitIndex) {
            this.splitIndex = splitIndex;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingFields#getTimeZone}
         * @param timeZone Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#time_zone CseLogMapping#time_zone}.
         * @return {@code this}
         */
        public Builder timeZone(java.lang.String timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingFields#getValue}
         * @param value Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#value CseLogMapping#value}.
         * @return {@code this}
         */
        public Builder value(java.lang.String value) {
            this.value = value;
            return this;
        }

        /**
         * Sets the value of {@link CseLogMappingFields#getValueType}
         * @param valueType Docs at Terraform Registry: {@link https://registry.terraform.io/providers/sumologic/sumologic/2.29.0/docs/resources/cse_log_mapping#value_type CseLogMapping#value_type}.
         * @return {@code this}
         */
        public Builder valueType(java.lang.String valueType) {
            this.valueType = valueType;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CseLogMappingFields}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CseLogMappingFields build() {
            return new Jsii$Proxy(this);
        }
    }

    /**
     * An implementation for {@link CseLogMappingFields}
     */
    @software.amazon.jsii.Internal
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CseLogMappingFields {
        private final java.lang.String name;
        private final java.util.List<java.lang.String> alternateValues;
        private final java.lang.Object caseInsensitive;
        private final java.lang.String defaultValue;
        private final java.util.List<java.lang.String> fieldJoin;
        private final java.lang.String format;
        private final java.util.List<java.lang.String> formatParameters;
        private final java.lang.String joinDelimiter;
        private final java.lang.Object lookup;
        private final java.util.List<java.lang.String> skippedValues;
        private final java.lang.String splitDelimiter;
        private final java.lang.Number splitIndex;
        private final java.lang.String timeZone;
        private final java.lang.String value;
        private final java.lang.String valueType;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.name = software.amazon.jsii.Kernel.get(this, "name", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.alternateValues = software.amazon.jsii.Kernel.get(this, "alternateValues", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.caseInsensitive = software.amazon.jsii.Kernel.get(this, "caseInsensitive", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.defaultValue = software.amazon.jsii.Kernel.get(this, "defaultValue", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.fieldJoin = software.amazon.jsii.Kernel.get(this, "fieldJoin", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.format = software.amazon.jsii.Kernel.get(this, "format", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.formatParameters = software.amazon.jsii.Kernel.get(this, "formatParameters", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.joinDelimiter = software.amazon.jsii.Kernel.get(this, "joinDelimiter", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.lookup = software.amazon.jsii.Kernel.get(this, "lookup", software.amazon.jsii.NativeType.forClass(java.lang.Object.class));
            this.skippedValues = software.amazon.jsii.Kernel.get(this, "skippedValues", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.splitDelimiter = software.amazon.jsii.Kernel.get(this, "splitDelimiter", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.splitIndex = software.amazon.jsii.Kernel.get(this, "splitIndex", software.amazon.jsii.NativeType.forClass(java.lang.Number.class));
            this.timeZone = software.amazon.jsii.Kernel.get(this, "timeZone", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.value = software.amazon.jsii.Kernel.get(this, "value", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
            this.valueType = software.amazon.jsii.Kernel.get(this, "valueType", software.amazon.jsii.NativeType.forClass(java.lang.String.class));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        protected Jsii$Proxy(final Builder builder) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.name = java.util.Objects.requireNonNull(builder.name, "name is required");
            this.alternateValues = builder.alternateValues;
            this.caseInsensitive = builder.caseInsensitive;
            this.defaultValue = builder.defaultValue;
            this.fieldJoin = builder.fieldJoin;
            this.format = builder.format;
            this.formatParameters = builder.formatParameters;
            this.joinDelimiter = builder.joinDelimiter;
            this.lookup = builder.lookup;
            this.skippedValues = builder.skippedValues;
            this.splitDelimiter = builder.splitDelimiter;
            this.splitIndex = builder.splitIndex;
            this.timeZone = builder.timeZone;
            this.value = builder.value;
            this.valueType = builder.valueType;
        }

        @Override
        public final java.lang.String getName() {
            return this.name;
        }

        @Override
        public final java.util.List<java.lang.String> getAlternateValues() {
            return this.alternateValues;
        }

        @Override
        public final java.lang.Object getCaseInsensitive() {
            return this.caseInsensitive;
        }

        @Override
        public final java.lang.String getDefaultValue() {
            return this.defaultValue;
        }

        @Override
        public final java.util.List<java.lang.String> getFieldJoin() {
            return this.fieldJoin;
        }

        @Override
        public final java.lang.String getFormat() {
            return this.format;
        }

        @Override
        public final java.util.List<java.lang.String> getFormatParameters() {
            return this.formatParameters;
        }

        @Override
        public final java.lang.String getJoinDelimiter() {
            return this.joinDelimiter;
        }

        @Override
        public final java.lang.Object getLookup() {
            return this.lookup;
        }

        @Override
        public final java.util.List<java.lang.String> getSkippedValues() {
            return this.skippedValues;
        }

        @Override
        public final java.lang.String getSplitDelimiter() {
            return this.splitDelimiter;
        }

        @Override
        public final java.lang.Number getSplitIndex() {
            return this.splitIndex;
        }

        @Override
        public final java.lang.String getTimeZone() {
            return this.timeZone;
        }

        @Override
        public final java.lang.String getValue() {
            return this.value;
        }

        @Override
        public final java.lang.String getValueType() {
            return this.valueType;
        }

        @Override
        @software.amazon.jsii.Internal
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("name", om.valueToTree(this.getName()));
            if (this.getAlternateValues() != null) {
                data.set("alternateValues", om.valueToTree(this.getAlternateValues()));
            }
            if (this.getCaseInsensitive() != null) {
                data.set("caseInsensitive", om.valueToTree(this.getCaseInsensitive()));
            }
            if (this.getDefaultValue() != null) {
                data.set("defaultValue", om.valueToTree(this.getDefaultValue()));
            }
            if (this.getFieldJoin() != null) {
                data.set("fieldJoin", om.valueToTree(this.getFieldJoin()));
            }
            if (this.getFormat() != null) {
                data.set("format", om.valueToTree(this.getFormat()));
            }
            if (this.getFormatParameters() != null) {
                data.set("formatParameters", om.valueToTree(this.getFormatParameters()));
            }
            if (this.getJoinDelimiter() != null) {
                data.set("joinDelimiter", om.valueToTree(this.getJoinDelimiter()));
            }
            if (this.getLookup() != null) {
                data.set("lookup", om.valueToTree(this.getLookup()));
            }
            if (this.getSkippedValues() != null) {
                data.set("skippedValues", om.valueToTree(this.getSkippedValues()));
            }
            if (this.getSplitDelimiter() != null) {
                data.set("splitDelimiter", om.valueToTree(this.getSplitDelimiter()));
            }
            if (this.getSplitIndex() != null) {
                data.set("splitIndex", om.valueToTree(this.getSplitIndex()));
            }
            if (this.getTimeZone() != null) {
                data.set("timeZone", om.valueToTree(this.getTimeZone()));
            }
            if (this.getValue() != null) {
                data.set("value", om.valueToTree(this.getValue()));
            }
            if (this.getValueType() != null) {
                data.set("valueType", om.valueToTree(this.getValueType()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("sumologic.cseLogMapping.CseLogMappingFields"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public final boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CseLogMappingFields.Jsii$Proxy that = (CseLogMappingFields.Jsii$Proxy) o;

            if (!name.equals(that.name)) return false;
            if (this.alternateValues != null ? !this.alternateValues.equals(that.alternateValues) : that.alternateValues != null) return false;
            if (this.caseInsensitive != null ? !this.caseInsensitive.equals(that.caseInsensitive) : that.caseInsensitive != null) return false;
            if (this.defaultValue != null ? !this.defaultValue.equals(that.defaultValue) : that.defaultValue != null) return false;
            if (this.fieldJoin != null ? !this.fieldJoin.equals(that.fieldJoin) : that.fieldJoin != null) return false;
            if (this.format != null ? !this.format.equals(that.format) : that.format != null) return false;
            if (this.formatParameters != null ? !this.formatParameters.equals(that.formatParameters) : that.formatParameters != null) return false;
            if (this.joinDelimiter != null ? !this.joinDelimiter.equals(that.joinDelimiter) : that.joinDelimiter != null) return false;
            if (this.lookup != null ? !this.lookup.equals(that.lookup) : that.lookup != null) return false;
            if (this.skippedValues != null ? !this.skippedValues.equals(that.skippedValues) : that.skippedValues != null) return false;
            if (this.splitDelimiter != null ? !this.splitDelimiter.equals(that.splitDelimiter) : that.splitDelimiter != null) return false;
            if (this.splitIndex != null ? !this.splitIndex.equals(that.splitIndex) : that.splitIndex != null) return false;
            if (this.timeZone != null ? !this.timeZone.equals(that.timeZone) : that.timeZone != null) return false;
            if (this.value != null ? !this.value.equals(that.value) : that.value != null) return false;
            return this.valueType != null ? this.valueType.equals(that.valueType) : that.valueType == null;
        }

        @Override
        public final int hashCode() {
            int result = this.name.hashCode();
            result = 31 * result + (this.alternateValues != null ? this.alternateValues.hashCode() : 0);
            result = 31 * result + (this.caseInsensitive != null ? this.caseInsensitive.hashCode() : 0);
            result = 31 * result + (this.defaultValue != null ? this.defaultValue.hashCode() : 0);
            result = 31 * result + (this.fieldJoin != null ? this.fieldJoin.hashCode() : 0);
            result = 31 * result + (this.format != null ? this.format.hashCode() : 0);
            result = 31 * result + (this.formatParameters != null ? this.formatParameters.hashCode() : 0);
            result = 31 * result + (this.joinDelimiter != null ? this.joinDelimiter.hashCode() : 0);
            result = 31 * result + (this.lookup != null ? this.lookup.hashCode() : 0);
            result = 31 * result + (this.skippedValues != null ? this.skippedValues.hashCode() : 0);
            result = 31 * result + (this.splitDelimiter != null ? this.splitDelimiter.hashCode() : 0);
            result = 31 * result + (this.splitIndex != null ? this.splitIndex.hashCode() : 0);
            result = 31 * result + (this.timeZone != null ? this.timeZone.hashCode() : 0);
            result = 31 * result + (this.value != null ? this.value.hashCode() : 0);
            result = 31 * result + (this.valueType != null ? this.valueType.hashCode() : 0);
            return result;
        }
    }
}
