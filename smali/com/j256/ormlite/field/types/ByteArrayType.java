package com.j256.ormlite.field.types; class ByteArrayType { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/field/types/ByteArrayType;
a=0;// .super Lcom/j256/ormlite/field/types/BaseDataType;
a=0;// .source "ByteArrayType.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final singleTon:Lcom/j256/ormlite/field/types/ByteArrayType;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 17
a=0;//     new-instance v0, Lcom/j256/ormlite/field/types/ByteArrayType;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/field/types/ByteArrayType;);
a=0;//     invoke-direct {v0}, Lcom/j256/ormlite/field/types/ByteArrayType;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/types/ByteArrayType;);
a=0;//     sput-object v0, Lcom/j256/ormlite/field/types/ByteArrayType;->singleTon:Lcom/j256/ormlite/field/types/ByteArrayType;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     sget-object v0, Lcom/j256/ormlite/field/SqlType;->BYTE_ARRAY:Lcom/j256/ormlite/field/SqlType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/SqlType;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     new-array v1, v1, [Ljava/lang/Class;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Class;);
a=0;//     invoke-direct {p0, v0, v1}, Lcom/j256/ormlite/field/types/BaseDataType;-><init>(Lcom/j256/ormlite/field/SqlType;[Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 25
a=0;//     #p0=(Reference,Lcom/j256/ormlite/field/types/ByteArrayType;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected constructor <init>(Lcom/j256/ormlite/field/SqlType;[Ljava/lang/Class;)V
a=0;//     .locals 0
a=0;//     .param p1, "sqlType"    # Lcom/j256/ormlite/field/SqlType;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/j256/ormlite/field/SqlType;",
a=0;//             "[",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     .local p2, "classes":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
a=0;//     invoke-direct {p0, p1, p2}, Lcom/j256/ormlite/field/types/BaseDataType;-><init>(Lcom/j256/ormlite/field/SqlType;[Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 32
a=0;//     #p0=(Reference,Lcom/j256/ormlite/field/types/ByteArrayType;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getSingleton()Lcom/j256/ormlite/field/types/ByteArrayType;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     sget-object v0, Lcom/j256/ormlite/field/types/ByteArrayType;->singleTon:Lcom/j256/ormlite/field/types/ByteArrayType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/types/ByteArrayType;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public dataIsEqual(Ljava/lang/Object;Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .param p1, "fieldObj1"    # Ljava/lang/Object;
a=0;//     .param p2, "fieldObj2"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 56
a=0;//     #v0=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 57
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 61
a=0;//     .end local p1    # "fieldObj1":Ljava/lang/Object;
a=0;//     .end local p2    # "fieldObj2":Ljava/lang/Object;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 58
a=0;//     .restart local p1    # "fieldObj1":Ljava/lang/Object;
a=0;//     .restart local p2    # "fieldObj2":Ljava/lang/Object;
a=0;//     :cond_1
a=0;//     #v0=(Null);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 61
a=0;//     check-cast p1, [B
a=0;// 
a=0;//     .end local p1    # "fieldObj1":Ljava/lang/Object;
a=0;//     check-cast p1, [B
a=0;// 
a=0;//     check-cast p2, [B
a=0;// 
a=0;//     .end local p2    # "fieldObj2":Ljava/lang/Object;
a=0;//     check-cast p2, [B
a=0;// 
a=0;//     invoke-static {p1, p2}, Ljava/util/Arrays;->equals([B[B)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isAppropriateId()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isArgumentHolderRequired()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public parseDefaultString(Lcom/j256/ormlite/field/FieldType;Ljava/lang/String;)Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .param p1, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p2, "defaultStr"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     new-instance v0, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/sql/SQLException;);
a=0;//     const-string v1, "byte[] type cannot have default values"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public resultStringToJava(Lcom/j256/ormlite/field/FieldType;Ljava/lang/String;I)Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .param p1, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p2, "stringValue"    # Ljava/lang/String;
a=0;//     .param p3, "columnPos"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     new-instance v0, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/sql/SQLException;);
a=0;//     const-string v1, "byte[] type cannot be converted from string to Java"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public resultToSqlArg(Lcom/j256/ormlite/field/FieldType;Lcom/j256/ormlite/support/DatabaseResults;I)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p2, "results"    # Lcom/j256/ormlite/support/DatabaseResults;
a=0;//     .param p3, "columnPos"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     invoke-interface {p2, p3}, Lcom/j256/ormlite/support/DatabaseResults;->getBytes(I)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     check-cast v0, [B
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
