package com.j256.ormlite.android; class DatabaseTableConfigUtil { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/android/DatabaseTableConfigUtil;
a=0;// .super Ljava/lang/Object;
a=0;// .source "DatabaseTableConfigUtil.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/j256/ormlite/android/DatabaseTableConfigUtil$DatabaseFieldSample;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final ALLOW_GENERATED_ID_INSERT:I = 0x18
a=0;// 
a=0;// .field private static final CAN_BE_NULL:I = 0x5
a=0;// 
a=0;// .field private static final COLUMN_DEFINITON:I = 0x19
a=0;// 
a=0;// .field private static final COLUMN_NAME:I = 0x1
a=0;// 
a=0;// .field private static final DATA_TYPE:I = 0x2
a=0;// 
a=0;// .field private static final DEFAULT_VALUE:I = 0x3
a=0;// 
a=0;// .field private static final FOREIGN:I = 0x9
a=0;// 
a=0;// .field private static final FOREIGN_AUTO_CREATE:I = 0x1a
a=0;// 
a=0;// .field private static final FOREIGN_AUTO_REFRESH:I = 0x15
a=0;// 
a=0;// .field private static final FOREIGN_COLUMN_NAME:I = 0x1c
a=0;// 
a=0;// .field private static final FORMAT:I = 0xe
a=0;// 
a=0;// .field private static final GENERATED_ID:I = 0x7
a=0;// 
a=0;// .field private static final GENERATED_ID_SEQUENCE:I = 0x8
a=0;// 
a=0;// .field private static final ID:I = 0x6
a=0;// 
a=0;// .field private static final INDEX:I = 0x11
a=0;// 
a=0;// .field private static final INDEX_NAME:I = 0x13
a=0;// 
a=0;// .field private static final MAX_FOREIGN_AUTO_REFRESH_LEVEL:I = 0x16
a=0;// 
a=0;// .field private static final PERSISTED:I = 0xd
a=0;// 
a=0;// .field private static final PERSISTER_CLASS:I = 0x17
a=0;// 
a=0;// .field private static final THROW_IF_NULL:I = 0xc
a=0;// 
a=0;// .field private static final UNIQUE:I = 0xf
a=0;// 
a=0;// .field private static final UNIQUE_COMBO:I = 0x10
a=0;// 
a=0;// .field private static final UNIQUE_INDEX:I = 0x12
a=0;// 
a=0;// .field private static final UNIQUE_INDEX_NAME:I = 0x14
a=0;// 
a=0;// .field private static final UNKNOWN_ENUM_NAME:I = 0xb
a=0;// 
a=0;// .field private static final USE_GET_SET:I = 0xa
a=0;// 
a=0;// .field private static final VERSION:I = 0x1b
a=0;// 
a=0;// .field private static final WIDTH:I = 0x4
a=0;// 
a=0;// .field private static annotationFactoryClazz:Ljava/lang/Class;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private static annotationMemberClazz:Ljava/lang/Class;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private static final configFieldNums:[I
a=0;// 
a=0;// .field private static elementsField:Ljava/lang/reflect/Field;
a=0;// 
a=0;// .field private static nameField:Ljava/lang/reflect/Field;
a=0;// 
a=0;// .field private static valueField:Ljava/lang/reflect/Field;
a=0;// 
a=0;// .field private static workedC:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput v0, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->workedC:I
a=0;// 
a=0;//     .line 38
a=0;//     invoke-static {}, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->lookupClasses()[I
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     sput-object v0, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->configFieldNums:[I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 402
a=0;//     #p0=(Reference,Lcom/j256/ormlite/android/DatabaseTableConfigUtil;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static assignConfigField(ILcom/j256/ormlite/field/DatabaseFieldConfig;Ljava/lang/reflect/Field;Ljava/lang/Object;)V
a=0;//     .locals 5
a=0;//     .param p0, "configNum"    # I
a=0;//     .param p1, "config"    # Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;//     .param p2, "field"    # Ljava/lang/reflect/Field;
a=0;//     .param p3, "value"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 296
a=0;//     packed-switch p0, :pswitch_data_0
a=0;// 
a=0;//     .line 387
a=0;//     new-instance v2, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Could not find support for DatabaseField number "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 298
a=0;//     :pswitch_0
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     check-cast p3, Ljava/lang/String;
a=0;// 
a=0;//     .end local p3    # "value":Ljava/lang/Object;
a=0;//     invoke-static {p3}, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->valueIfNotBlank(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setColumnName(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 389
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 301
a=0;//     .restart local p3    # "value":Ljava/lang/Object;
a=0;//     :pswitch_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     check-cast p3, Lcom/j256/ormlite/field/DataType;
a=0;// 
a=0;//     .end local p3    # "value":Ljava/lang/Object;
a=0;//     invoke-virtual {p1, p3}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setDataType(Lcom/j256/ormlite/field/DataType;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .restart local p3    # "value":Ljava/lang/Object;
a=0;//     :pswitch_2
a=0;//     move-object v1, p3
a=0;// 
a=0;//     .line 304
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     .line 305
a=0;//     .local v1, "defaultValue":Ljava/lang/String;
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const-string v2, "__ormlite__ no default value string was specified"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 306
a=0;//     invoke-virtual {p1, v1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setDefaultValue(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 310
a=0;//     .end local v1    # "defaultValue":Ljava/lang/String;
a=0;//     :pswitch_3
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     check-cast p3, Ljava/lang/Integer;
a=0;// 
a=0;//     .end local p3    # "value":Ljava/lang/Object;
a=0;//     invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1, v2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setWidth(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 313
a=0;//     .restart local p3    # "value":Ljava/lang/Object;
a=0;//     :pswitch_4
a=0;//     #v2=(Uninit);
a=0;//     check-cast p3, Ljava/lang/Boolean;
a=0;// 
a=0;//     .end local p3    # "value":Ljava/lang/Object;
a=0;//     invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {p1, v2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setCanBeNull(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 316
a=0;//     .restart local p3    # "value":Ljava/lang/Object;
a=0;//     :pswitch_5
a=0;//     #v2=(Uninit);
a=0;//     check-cast p3, Ljava/lang/Boolean;
a=0;// 
a=0;//     .end local p3    # "value":Ljava/lang/Object;
a=0;//     invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {p1, v2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setId(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 319
a=0;//     .restart local p3    # "value":Ljava/lang/Object;
a=0;//     :pswitch_6
a=0;//     #v2=(Uninit);
a=0;//     check-cast p3, Ljava/lang/Boolean;
a=0;// 
a=0;//     .end local p3    # "value":Ljava/lang/Object;
a=0;//     invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {p1, v2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setGeneratedId(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 322
a=0;//     .restart local p3    # "value":Ljava/lang/Object;
a=0;//     :pswitch_7
a=0;//     #v2=(Uninit);
a=0;//     check-cast p3, Ljava/lang/String;
a=0;// 
a=0;//     .end local p3    # "value":Ljava/lang/Object;
a=0;//     invoke-static {p3}, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->valueIfNotBlank(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setGeneratedIdSequence(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 325
a=0;//     .restart local p3    # "value":Ljava/lang/Object;
a=0;//     :pswitch_8
a=0;//     #v2=(Uninit);
a=0;//     check-cast p3, Ljava/lang/Boolean;
a=0;// 
a=0;//     .end local p3    # "value":Ljava/lang/Object;
a=0;//     invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {p1, v2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setForeign(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 328
a=0;//     .restart local p3    # "value":Ljava/lang/Object;
a=0;//     :pswitch_9
a=0;//     #v2=(Uninit);
a=0;//     check-cast p3, Ljava/lang/Boolean;
a=0;// 
a=0;//     .end local p3    # "value":Ljava/lang/Object;
a=0;//     invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {p1, v2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setUseGetSet(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 331
a=0;//     .restart local p3    # "value":Ljava/lang/Object;
a=0;//     :pswitch_a
a=0;//     #v2=(Uninit);
a=0;//     check-cast p3, Ljava/lang/String;
a=0;// 
a=0;//     .end local p3    # "value":Ljava/lang/Object;
a=0;//     invoke-static {p2, p3}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->findMatchingEnumVal(Ljava/lang/reflect/Field;Ljava/lang/String;)Ljava/lang/Enum;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Enum;);
a=0;//     invoke-virtual {p1, v2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setUnknownEnumValue(Ljava/lang/Enum;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 334
a=0;//     .restart local p3    # "value":Ljava/lang/Object;
a=0;//     :pswitch_b
a=0;//     #v2=(Uninit);
a=0;//     check-cast p3, Ljava/lang/Boolean;
a=0;// 
a=0;//     .end local p3    # "value":Ljava/lang/Object;
a=0;//     invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {p1, v2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setThrowIfNull(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 337
a=0;//     .restart local p3    # "value":Ljava/lang/Object;
a=0;//     :pswitch_c
a=0;//     #v2=(Uninit);
a=0;//     check-cast p3, Ljava/lang/Boolean;
a=0;// 
a=0;//     .end local p3    # "value":Ljava/lang/Object;
a=0;//     invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {p1, v2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setPersisted(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 340
a=0;//     .restart local p3    # "value":Ljava/lang/Object;
a=0;//     :pswitch_d
a=0;//     #v2=(Uninit);
a=0;//     check-cast p3, Ljava/lang/String;
a=0;// 
a=0;//     .end local p3    # "value":Ljava/lang/Object;
a=0;//     invoke-static {p3}, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->valueIfNotBlank(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setFormat(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 343
a=0;//     .restart local p3    # "value":Ljava/lang/Object;
a=0;//     :pswitch_e
a=0;//     #v2=(Uninit);
a=0;//     check-cast p3, Ljava/lang/Boolean;
a=0;// 
a=0;//     .end local p3    # "value":Ljava/lang/Object;
a=0;//     invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {p1, v2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setUnique(Z)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 346
a=0;//     .restart local p3    # "value":Ljava/lang/Object;
a=0;//     :pswitch_f
a=0;//     #v2=(Uninit);
a=0;//     check-cast p3, Ljava/lang/Boolean;
a=0;// 
a=0;//     .end local p3    # "value":Ljava/lang/Object;
a=0;//     invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {p1, v2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setUniqueCombo(Z)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 349
a=0;//     .restart local p3    # "value":Ljava/lang/Object;
a=0;//     :pswitch_10
a=0;//     #v2=(Uninit);
a=0;//     check-cast p3, Ljava/lang/Boolean;
a=0;// 
a=0;//     .end local p3    # "value":Ljava/lang/Object;
a=0;//     invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {p1, v2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setIndex(Z)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 352
a=0;//     .restart local p3    # "value":Ljava/lang/Object;
a=0;//     :pswitch_11
a=0;//     #v2=(Uninit);
a=0;//     check-cast p3, Ljava/lang/Boolean;
a=0;// 
a=0;//     .end local p3    # "value":Ljava/lang/Object;
a=0;//     invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {p1, v2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setUniqueIndex(Z)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 355
a=0;//     .restart local p3    # "value":Ljava/lang/Object;
a=0;//     :pswitch_12
a=0;//     #v2=(Uninit);
a=0;//     check-cast p3, Ljava/lang/String;
a=0;// 
a=0;//     .end local p3    # "value":Ljava/lang/Object;
a=0;//     invoke-static {p3}, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->valueIfNotBlank(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setIndexName(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 358
a=0;//     .restart local p3    # "value":Ljava/lang/Object;
a=0;//     :pswitch_13
a=0;//     #v2=(Uninit);
a=0;//     check-cast p3, Ljava/lang/String;
a=0;// 
a=0;//     .end local p3    # "value":Ljava/lang/Object;
a=0;//     invoke-static {p3}, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->valueIfNotBlank(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setUniqueIndexName(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 361
a=0;//     .restart local p3    # "value":Ljava/lang/Object;
a=0;//     :pswitch_14
a=0;//     #v2=(Uninit);
a=0;//     check-cast p3, Ljava/lang/Boolean;
a=0;// 
a=0;//     .end local p3    # "value":Ljava/lang/Object;
a=0;//     invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {p1, v2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setForeignAutoRefresh(Z)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 364
a=0;//     .restart local p3    # "value":Ljava/lang/Object;
a=0;//     :pswitch_15
a=0;//     #v2=(Uninit);
a=0;//     check-cast p3, Ljava/lang/Integer;
a=0;// 
a=0;//     .end local p3    # "value":Ljava/lang/Object;
a=0;//     invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1, v2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setMaxForeignAutoRefreshLevel(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .restart local p3    # "value":Ljava/lang/Object;
a=0;//     :pswitch_16
a=0;//     #v2=(Uninit);
a=0;//     move-object v0, p3
a=0;// 
a=0;//     .line 368
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/Class;
a=0;// 
a=0;//     .line 369
a=0;//     .local v0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/j256/ormlite/field/DataPersister;>;"
a=0;//     invoke-virtual {p1, v0}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setPersisterClass(Ljava/lang/Class;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 372
a=0;//     .end local v0    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<+Lcom/j256/ormlite/field/DataPersister;>;"
a=0;//     :pswitch_17
a=0;//     #v0=(Uninit);
a=0;//     check-cast p3, Ljava/lang/Boolean;
a=0;// 
a=0;//     .end local p3    # "value":Ljava/lang/Object;
a=0;//     invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {p1, v2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setAllowGeneratedIdInsert(Z)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 375
a=0;//     .restart local p3    # "value":Ljava/lang/Object;
a=0;//     :pswitch_18
a=0;//     #v2=(Uninit);
a=0;//     check-cast p3, Ljava/lang/String;
a=0;// 
a=0;//     .end local p3    # "value":Ljava/lang/Object;
a=0;//     invoke-static {p3}, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->valueIfNotBlank(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setColumnDefinition(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 378
a=0;//     .restart local p3    # "value":Ljava/lang/Object;
a=0;//     :pswitch_19
a=0;//     #v2=(Uninit);
a=0;//     check-cast p3, Ljava/lang/Boolean;
a=0;// 
a=0;//     .end local p3    # "value":Ljava/lang/Object;
a=0;//     invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {p1, v2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setForeignAutoCreate(Z)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 381
a=0;//     .restart local p3    # "value":Ljava/lang/Object;
a=0;//     :pswitch_1a
a=0;//     #v2=(Uninit);
a=0;//     check-cast p3, Ljava/lang/Boolean;
a=0;// 
a=0;//     .end local p3    # "value":Ljava/lang/Object;
a=0;//     invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {p1, v2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setVersion(Z)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 384
a=0;//     .restart local p3    # "value":Ljava/lang/Object;
a=0;//     :pswitch_1b
a=0;//     #v2=(Uninit);
a=0;//     check-cast p3, Ljava/lang/String;
a=0;// 
a=0;//     .end local p3    # "value":Ljava/lang/Object;
a=0;//     invoke-static {p3}, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->valueIfNotBlank(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->setForeignColumnName(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 296
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//         :pswitch_6
a=0;//         :pswitch_7
a=0;//         :pswitch_8
a=0;//         :pswitch_9
a=0;//         :pswitch_a
a=0;//         :pswitch_b
a=0;//         :pswitch_c
a=0;//         :pswitch_d
a=0;//         :pswitch_e
a=0;//         :pswitch_f
a=0;//         :pswitch_10
a=0;//         :pswitch_11
a=0;//         :pswitch_12
a=0;//         :pswitch_13
a=0;//         :pswitch_14
a=0;//         :pswitch_15
a=0;//         :pswitch_16
a=0;//         :pswitch_17
a=0;//         :pswitch_18
a=0;//         :pswitch_19
a=0;//         :pswitch_1a
a=0;//         :pswitch_1b
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private static buildConfig(Lcom/j256/ormlite/field/DatabaseField;Ljava/lang/String;Ljava/lang/reflect/Field;)Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;//     .locals 8
a=0;//     .param p0, "databaseField"    # Lcom/j256/ormlite/field/DatabaseField;
a=0;//     .param p1, "tableName"    # Ljava/lang/String;
a=0;//     .param p2, "field"    # Ljava/lang/reflect/Field;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 271
a=0;//     #v0=(Null);
a=0;//     invoke-static {p0}, Ljava/lang/reflect/Proxy;->getInvocationHandler(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 272
a=0;//     .local v4, "proxy":Ljava/lang/reflect/InvocationHandler;
a=0;//     #v4=(Reference,Ljava/lang/reflect/InvocationHandler;);
a=0;//     invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Class;);
a=0;//     sget-object v7, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->annotationFactoryClazz:Ljava/lang/Class;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Class;);
a=0;//     if-eq v6, v7, :cond_1
a=0;// 
a=0;//     .line 288
a=0;//     :cond_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 276
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Reference,Ljava/lang/Class;);
a=0;//     sget-object v6, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->elementsField:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v6, v4}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 277
a=0;//     .local v1, "elementsObject":Ljava/lang/Object;
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 280
a=0;//     new-instance v0, Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     invoke-virtual {p2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v0, v6}, Lcom/j256/ormlite/field/DatabaseFieldConfig;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 281
a=0;//     .local v0, "config":Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     check-cast v1, [Ljava/lang/Object;
a=0;// 
a=0;//     .end local v1    # "elementsObject":Ljava/lang/Object;
a=0;//     move-object v3, v1
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     check-cast v3, [Ljava/lang/Object;
a=0;// 
a=0;//     .line 282
a=0;//     .local v3, "objs":[Ljava/lang/Object;
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_0
a=0;//     #v2=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     sget-object v6, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->configFieldNums:[I
a=0;// 
a=0;//     #v6=(Reference,[I);
a=0;//     array-length v6, v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ge v2, v6, :cond_0
a=0;// 
a=0;//     .line 283
a=0;//     sget-object v6, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->valueField:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/reflect/Field;);
a=0;//     aget-object v7, v3, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 284
a=0;//     .local v5, "value":Ljava/lang/Object;
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 285
a=0;//     sget-object v6, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->configFieldNums:[I
a=0;// 
a=0;//     aget v6, v6, v2
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v6, v0, p2, v5}, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->assignConfigField(ILcom/j256/ormlite/field/DatabaseFieldConfig;Ljava/lang/reflect/Field;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 282
a=0;//     :cond_2
a=0;//     #v6=(Conflicted);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static configFieldNameToNum(Ljava/lang/String;)I
a=0;//     .locals 3
a=0;//     .param p0, "configName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 166
a=0;//     const-string v0, "columnName"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 167
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 221
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     return v0
a=0;// 
a=0;//     .line 168
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "dataType"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 169
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 170
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "defaultValue"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 171
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 172
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "width"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 173
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 174
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "canBeNull"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 175
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 176
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "id"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 177
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 178
a=0;//     :cond_5
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "generatedId"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     .line 179
a=0;//     const/4 v0, 0x7
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 180
a=0;//     :cond_6
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "generatedIdSequence"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     .line 181
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 182
a=0;//     :cond_7
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "foreign"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     .line 183
a=0;//     const/16 v0, 0x9
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 184
a=0;//     :cond_8
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "useGetSet"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     .line 185
a=0;//     const/16 v0, 0xa
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 186
a=0;//     :cond_9
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "unknownEnumName"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_a
a=0;// 
a=0;//     .line 187
a=0;//     const/16 v0, 0xb
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 188
a=0;//     :cond_a
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "throwIfNull"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_b
a=0;// 
a=0;//     .line 189
a=0;//     const/16 v0, 0xc
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 190
a=0;//     :cond_b
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "persisted"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_c
a=0;// 
a=0;//     .line 191
a=0;//     const/16 v0, 0xd
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 192
a=0;//     :cond_c
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "format"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_d
a=0;// 
a=0;//     .line 193
a=0;//     const/16 v0, 0xe
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 194
a=0;//     :cond_d
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "unique"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_e
a=0;// 
a=0;//     .line 195
a=0;//     const/16 v0, 0xf
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 196
a=0;//     :cond_e
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "uniqueCombo"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_f
a=0;// 
a=0;//     .line 197
a=0;//     const/16 v0, 0x10
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 198
a=0;//     :cond_f
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "index"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_10
a=0;// 
a=0;//     .line 199
a=0;//     const/16 v0, 0x11
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 200
a=0;//     :cond_10
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "uniqueIndex"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_11
a=0;// 
a=0;//     .line 201
a=0;//     const/16 v0, 0x12
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 202
a=0;//     :cond_11
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "indexName"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_12
a=0;// 
a=0;//     .line 203
a=0;//     const/16 v0, 0x13
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 204
a=0;//     :cond_12
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "uniqueIndexName"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_13
a=0;// 
a=0;//     .line 205
a=0;//     const/16 v0, 0x14
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 206
a=0;//     :cond_13
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "foreignAutoRefresh"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_14
a=0;// 
a=0;//     .line 207
a=0;//     const/16 v0, 0x15
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 208
a=0;//     :cond_14
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "maxForeignAutoRefreshLevel"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_15
a=0;// 
a=0;//     .line 209
a=0;//     const/16 v0, 0x16
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 210
a=0;//     :cond_15
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "persisterClass"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_16
a=0;// 
a=0;//     .line 211
a=0;//     const/16 v0, 0x17
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 212
a=0;//     :cond_16
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "allowGeneratedIdInsert"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_17
a=0;// 
a=0;//     .line 213
a=0;//     const/16 v0, 0x18
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 214
a=0;//     :cond_17
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "columnDefinition"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_18
a=0;// 
a=0;//     .line 215
a=0;//     const/16 v0, 0x19
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 216
a=0;//     :cond_18
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "foreignAutoCreate"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_19
a=0;// 
a=0;//     .line 217
a=0;//     const/16 v0, 0x1a
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 218
a=0;//     :cond_19
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "version"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1a
a=0;// 
a=0;//     .line 219
a=0;//     const/16 v0, 0x1b
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 220
a=0;//     :cond_1a
a=0;//     #v0=(Boolean);
a=0;//     const-string v0, "foreignColumnName"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1b
a=0;// 
a=0;//     .line 221
a=0;//     const/16 v0, 0x1c
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 223
a=0;//     :cond_1b
a=0;//     #v0=(Boolean);
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Could not find support for DatabaseField "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private static configFromField(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/String;Ljava/lang/reflect/Field;)Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;//     .locals 3
a=0;//     .param p0, "databaseType"    # Lcom/j256/ormlite/db/DatabaseType;
a=0;//     .param p1, "tableName"    # Ljava/lang/String;
a=0;//     .param p2, "field"    # Ljava/lang/reflect/Field;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 233
a=0;//     sget-object v2, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->configFieldNums:[I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 234
a=0;//     invoke-static {p0, p1, p2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->fromField(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/String;Ljava/lang/reflect/Field;)Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 261
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 241
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Reference,[I);
a=0;//     const-class v2, Lcom/j256/ormlite/field/DatabaseField;
a=0;// 
a=0;//     invoke-virtual {p2, v2}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/annotation/Annotation;);
a=0;//     check-cast v1, Lcom/j256/ormlite/field/DatabaseField;
a=0;// 
a=0;//     .line 243
a=0;//     .local v1, "databaseField":Lcom/j256/ormlite/field/DatabaseField;
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 245
a=0;//     .local v0, "config":Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;//     #v0=(Null);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 246
a=0;//     :try_start_0
a=0;//     invoke-static {v1, p1, p2}, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->buildConfig(Lcom/j256/ormlite/field/DatabaseField;Ljava/lang/String;Ljava/lang/reflect/Field;)Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 252
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 258
a=0;//     invoke-static {p0, p1, p2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->fromField(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/String;Ljava/lang/reflect/Field;)Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 260
a=0;//     :cond_2
a=0;//     sget v2, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->workedC:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     sput v2, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->workedC:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 248
a=0;//     :catch_0
a=0;//     #v0=(Null);v2=(Reference,Ljava/lang/Class;);
a=0;//     move-exception v2
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static fromClass(Lcom/j256/ormlite/support/ConnectionSource;Ljava/lang/Class;)Lcom/j256/ormlite/table/DatabaseTableConfig;
a=0;//     .locals 10
a=0;//     .param p0, "connectionSource"    # Lcom/j256/ormlite/support/ConnectionSource;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Lcom/j256/ormlite/support/ConnectionSource;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<TT;>;)",
a=0;//             "Lcom/j256/ormlite/table/DatabaseTableConfig",
a=0;//             "<TT;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<TT;>;"
a=0;//     invoke-interface {p0}, Lcom/j256/ormlite/support/ConnectionSource;->getDatabaseType()Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 46
a=0;//     .local v3, "databaseType":Lcom/j256/ormlite/db/DatabaseType;
a=0;//     #v3=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     invoke-static {p1}, Lcom/j256/ormlite/table/DatabaseTableConfig;->extractTableName(Ljava/lang/Class;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 47
a=0;//     .local v8, "tableName":Ljava/lang/String;
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 48
a=0;//     .local v5, "fieldConfigs":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/field/DatabaseFieldConfig;>;"
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     .local v1, "classWalk":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/Class;);v2=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 49
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "arr$":[Ljava/lang/reflect/Field;
a=0;//     #v0=(Reference,[Ljava/lang/reflect/Field;);
a=0;//     array-length v7, v0
a=0;// 
a=0;//     .local v7, "len$":I
a=0;//     #v7=(Integer);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .local v6, "i$":I
a=0;//     :goto_1
a=0;//     #v6=(Integer);
a=0;//     if-ge v6, v7, :cond_1
a=0;// 
a=0;//     aget-object v4, v0, v6
a=0;// 
a=0;//     .line 50
a=0;//     .local v4, "field":Ljava/lang/reflect/Field;
a=0;//     #v4=(Null);
a=0;//     invoke-static {v3, v8, v4}, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->configFromField(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/String;Ljava/lang/reflect/Field;)Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 51
a=0;//     .local v2, "config":Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;//     #v2=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {v2}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->isPersisted()Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_0
a=0;// 
a=0;//     .line 52
a=0;//     invoke-interface {v5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 49
a=0;//     :cond_0
a=0;//     #v9=(Conflicted);
a=0;//     add-int/lit8 v6, v6, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 48
a=0;//     .end local v2    # "config":Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;//     .end local v4    # "field":Ljava/lang/reflect/Field;
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 56
a=0;//     .end local v0    # "arr$":[Ljava/lang/reflect/Field;
a=0;//     .end local v6    # "i$":I
a=0;//     .end local v7    # "len$":I
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-interface {v5}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-nez v9, :cond_3
a=0;// 
a=0;//     .line 57
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 59
a=0;//     :goto_2
a=0;//     #v9=(Reference,Lcom/j256/ormlite/table/DatabaseTableConfig;);
a=0;//     return-object v9
a=0;// 
a=0;//     :cond_3
a=0;//     #v9=(Integer);
a=0;//     new-instance v9, Lcom/j256/ormlite/table/DatabaseTableConfig;
a=0;// 
a=0;//     #v9=(UninitRef,Lcom/j256/ormlite/table/DatabaseTableConfig;);
a=0;//     invoke-direct {v9, p1, v8, v5}, Lcom/j256/ormlite/table/DatabaseTableConfig;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/util/List;)V
a=0;// 
a=0;//     #v9=(Reference,Lcom/j256/ormlite/table/DatabaseTableConfig;);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public static getWorkedC()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     sget v0, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->workedC:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private static lookupClasses()[I
a=0;//     .locals 14
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 77
a=0;//     :try_start_0
a=0;//     #v11=(Null);
a=0;//     const-string v12, "org.apache.harmony.lang.annotation.AnnotationFactory"
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v12}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     sput-object v12, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->annotationFactoryClazz:Ljava/lang/Class;
a=0;// 
a=0;//     .line 78
a=0;//     const-string v12, "org.apache.harmony.lang.annotation.AnnotationMember"
a=0;// 
a=0;//     invoke-static {v12}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     sput-object v12, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->annotationMemberClazz:Ljava/lang/Class;
a=0;// 
a=0;//     .line 79
a=0;//     const-string v12, "[Lorg.apache.harmony.lang.annotation.AnnotationMember;"
a=0;// 
a=0;//     invoke-static {v12}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 80
a=0;//     .local v1, "annotationMemberArrayClazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     const-string v12, "org.apache.harmony.lang.annotation.AnnotationMember"
a=0;// 
a=0;//     invoke-static {v12}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     sput-object v12, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->annotationMemberClazz:Ljava/lang/Class;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 87
a=0;//     :try_start_1
a=0;//     sget-object v12, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->annotationFactoryClazz:Ljava/lang/Class;
a=0;// 
a=0;//     const-string v13, "elements"
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     sput-object v12, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->elementsField:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     .line 88
a=0;//     sget-object v12, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->elementsField:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     const/4 v13, 0x1
a=0;// 
a=0;//     #v13=(One);
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/reflect/Field;->setAccessible(Z)V
a=0;// 
a=0;//     .line 90
a=0;//     sget-object v12, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->annotationMemberClazz:Ljava/lang/Class;
a=0;// 
a=0;//     const-string v13, "name"
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     sput-object v12, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->nameField:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     .line 91
a=0;//     sget-object v12, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->nameField:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     const/4 v13, 0x1
a=0;// 
a=0;//     #v13=(One);
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/reflect/Field;->setAccessible(Z)V
a=0;// 
a=0;//     .line 92
a=0;//     sget-object v12, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->annotationMemberClazz:Ljava/lang/Class;
a=0;// 
a=0;//     const-string v13, "value"
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     sput-object v12, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->valueField:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     .line 93
a=0;//     sget-object v12, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->valueField:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     const/4 v13, 0x1
a=0;// 
a=0;//     #v13=(One);
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/reflect/Field;->setAccessible(Z)V
a=0;// 
a=0;//     .line 95
a=0;//     const-class v12, Lcom/j256/ormlite/android/DatabaseTableConfigUtil$DatabaseFieldSample;
a=0;// 
a=0;//     const-string v13, "field"
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_2
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 102
a=0;//     .local v7, "fieldField":Ljava/lang/reflect/Field;
a=0;//     #v7=(Reference,Ljava/lang/reflect/Field;);
a=0;//     const-class v12, Lcom/j256/ormlite/field/DatabaseField;
a=0;// 
a=0;//     invoke-virtual {v7, v12}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/annotation/Annotation;);
a=0;//     check-cast v3, Lcom/j256/ormlite/field/DatabaseField;
a=0;// 
a=0;//     .line 103
a=0;//     .local v3, "databaseField":Lcom/j256/ormlite/field/DatabaseField;
a=0;//     invoke-static {v3}, Ljava/lang/reflect/Proxy;->getInvocationHandler(Ljava/lang/Object;)Ljava/lang/reflect/InvocationHandler;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 104
a=0;//     .local v10, "proxy":Ljava/lang/reflect/InvocationHandler;
a=0;//     #v10=(Reference,Ljava/lang/reflect/InvocationHandler;);
a=0;//     invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     sget-object v13, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->annotationFactoryClazz:Ljava/lang/Class;
a=0;// 
a=0;//     if-eq v12, v13, :cond_1
a=0;// 
a=0;//     move-object v2, v11
a=0;// 
a=0;//     .line 125
a=0;//     .end local v3    # "databaseField":Lcom/j256/ormlite/field/DatabaseField;
a=0;//     .end local v7    # "fieldField":Ljava/lang/reflect/Field;
a=0;//     .end local v10    # "proxy":Ljava/lang/reflect/InvocationHandler;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,[I);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 81
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v13=(Uninit);
a=0;//     move-exception v4
a=0;// 
a=0;//     .local v4, "e":Ljava/lang/ClassNotFoundException;
a=0;//     #v4=(Reference,Ljava/lang/ClassNotFoundException;);
a=0;//     move-object v2, v11
a=0;// 
a=0;//     .line 82
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 96
a=0;//     .end local v4    # "e":Ljava/lang/ClassNotFoundException;
a=0;//     :catch_1
a=0;//     #v1=(Reference,Ljava/lang/Class;);v2=(Uninit);v4=(Uninit);v12=(Reference,Ujava/lang/Object;);v13=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     .local v4, "e":Ljava/lang/SecurityException;
a=0;//     #v4=(Reference,Ljava/lang/SecurityException;);
a=0;//     move-object v2, v11
a=0;// 
a=0;//     .line 97
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 98
a=0;//     .end local v4    # "e":Ljava/lang/SecurityException;
a=0;//     :catch_2
a=0;//     #v2=(Uninit);v4=(Uninit);
a=0;//     move-exception v4
a=0;// 
a=0;//     .local v4, "e":Ljava/lang/NoSuchFieldException;
a=0;//     #v4=(Reference,Ljava/lang/NoSuchFieldException;);
a=0;//     move-object v2, v11
a=0;// 
a=0;//     .line 99
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 110
a=0;//     .end local v4    # "e":Ljava/lang/NoSuchFieldException;
a=0;//     .restart local v3    # "databaseField":Lcom/j256/ormlite/field/DatabaseField;
a=0;//     .restart local v7    # "fieldField":Ljava/lang/reflect/Field;
a=0;//     .restart local v10    # "proxy":Ljava/lang/reflect/InvocationHandler;
a=0;//     :cond_1
a=0;//     :try_start_2
a=0;//     #v2=(Uninit);v3=(Reference,Lcom/j256/ormlite/field/DatabaseField;);v4=(Uninit);v7=(Reference,Ljava/lang/reflect/Field;);v10=(Reference,Ljava/lang/reflect/InvocationHandler;);v13=(Reference,Ljava/lang/Class;);
a=0;//     sget-object v12, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->elementsField:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     invoke-virtual {v12, v10}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 111
a=0;//     .local v6, "elements":Ljava/lang/Object;
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     if-eq v12, v1, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     move-object v2, v11
a=0;// 
a=0;//     .line 112
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 115
a=0;//     :cond_3
a=0;//     #v2=(Uninit);
a=0;//     check-cast v6, [Ljava/lang/Object;
a=0;// 
a=0;//     .end local v6    # "elements":Ljava/lang/Object;
a=0;//     move-object v0, v6
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     check-cast v0, [Ljava/lang/Object;
a=0;// 
a=0;//     move-object v5, v0
a=0;// 
a=0;//     .line 116
a=0;//     .local v5, "elementArray":[Ljava/lang/Object;
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     array-length v12, v5
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     new-array v2, v12, [I
a=0;// 
a=0;//     .line 119
a=0;//     .local v2, "configNums":[I
a=0;//     #v2=(Reference,[I);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .local v8, "i":I
a=0;//     :goto_1
a=0;//     #v8=(Integer);v9=(Conflicted);
a=0;//     array-length v12, v5
a=0;// 
a=0;//     if-ge v8, v12, :cond_0
a=0;// 
a=0;//     .line 120
a=0;//     sget-object v12, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->nameField:Ljava/lang/reflect/Field;
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/reflect/Field;);
a=0;//     aget-object v13, v5, v8
a=0;// 
a=0;//     #v13=(Null);
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v9, Ljava/lang/String;
a=0;// 
a=0;//     .line 121
a=0;//     .local v9, "name":Ljava/lang/String;
a=0;//     invoke-static {v9}, Lcom/j256/ormlite/android/DatabaseTableConfigUtil;->configFieldNameToNum(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     aput v12, v2, v8
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_3
a=0;// 
a=0;//     .line 119
a=0;//     add-int/lit8 v8, v8, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 124
a=0;//     .end local v2    # "configNums":[I
a=0;//     .end local v5    # "elementArray":[Ljava/lang/Object;
a=0;//     .end local v8    # "i":I
a=0;//     .end local v9    # "name":Ljava/lang/String;
a=0;//     :catch_3
a=0;//     #v0=(Conflicted);v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);v12=(Conflicted);v13=(Reference,Ljava/lang/Class;);
a=0;//     move-exception v4
a=0;// 
a=0;//     .local v4, "e":Ljava/lang/IllegalAccessException;
a=0;//     #v4=(Reference,Ljava/lang/IllegalAccessException;);
a=0;//     move-object v2, v11
a=0;// 
a=0;//     .line 125
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static valueIfNotBlank(Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p0, "value"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 392
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 393
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 p0, 0x0
a=0;// 
a=0;//     .line 395
a=0;//     :cond_1
a=0;//     return-object p0
a=0;// .end method
}}
