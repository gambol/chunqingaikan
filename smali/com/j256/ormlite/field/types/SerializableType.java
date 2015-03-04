package com.j256.ormlite.field.types; class SerializableType { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/field/types/SerializableType;
a=0;// .super Lcom/j256/ormlite/field/types/BaseDataType;
a=0;// .source "SerializableType.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final singleTon:Lcom/j256/ormlite/field/types/SerializableType;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     new-instance v0, Lcom/j256/ormlite/field/types/SerializableType;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/field/types/SerializableType;);
a=0;//     invoke-direct {v0}, Lcom/j256/ormlite/field/types/SerializableType;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/types/SerializableType;);
a=0;//     sput-object v0, Lcom/j256/ormlite/field/types/SerializableType;->singleTon:Lcom/j256/ormlite/field/types/SerializableType;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     sget-object v0, Lcom/j256/ormlite/field/SqlType;->SERIALIZABLE:Lcom/j256/ormlite/field/SqlType;
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
a=0;//     .line 37
a=0;//     #p0=(Reference,Lcom/j256/ormlite/field/types/SerializableType;);
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
a=0;//     .line 43
a=0;//     .local p2, "classes":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
a=0;//     invoke-direct {p0, p1, p2}, Lcom/j256/ormlite/field/types/BaseDataType;-><init>(Lcom/j256/ormlite/field/SqlType;[Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 44
a=0;//     #p0=(Reference,Lcom/j256/ormlite/field/types/SerializableType;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getSingleton()Lcom/j256/ormlite/field/types/SerializableType;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     sget-object v0, Lcom/j256/ormlite/field/types/SerializableType;->singleTon:Lcom/j256/ormlite/field/types/SerializableType;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/field/types/SerializableType;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public isAppropriateId()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
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
a=0;//     .line 125
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isComparable()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isStreamType()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 110
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isValidForField(Ljava/lang/reflect/Field;)Z
a=0;//     .locals 2
a=0;//     .param p1, "field"    # Ljava/lang/reflect/Field;
a=0;// 
a=0;//     .prologue
a=0;//     .line 104
a=0;//     const-class v0, Ljava/io/Serializable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public javaToSqlArg(Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 6
a=0;//     .param p1, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p2, "obj"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 82
a=0;//     .local v1, "objOutStream":Ljava/io/ObjectOutputStream;
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     new-instance v3, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 83
a=0;//     .local v3, "outStream":Ljava/io/ByteArrayOutputStream;
a=0;//     #v3=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     new-instance v2, Ljava/io/ObjectOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/ObjectOutputStream;);
a=0;//     invoke-direct {v2, v3}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 84
a=0;//     .end local v1    # "objOutStream":Ljava/io/ObjectOutputStream;
a=0;//     .local v2, "objOutStream":Ljava/io/ObjectOutputStream;
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Ljava/io/ObjectOutputStream;);
a=0;//     invoke-virtual {v2, p2}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 85
a=0;//     invoke-virtual {v2}, Ljava/io/ObjectOutputStream;->close()V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     .line 86
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 87
a=0;//     .end local v2    # "objOutStream":Ljava/io/ObjectOutputStream;
a=0;//     .restart local v1    # "objOutStream":Ljava/io/ObjectOutputStream;
a=0;//     :try_start_2
a=0;//     invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 91
a=0;//     #v4=(Reference,[B);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 94
a=0;//     :try_start_3
a=0;//     invoke-virtual {v1}, Ljava/io/ObjectOutputStream;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
a=0;// 
a=0;//     .line 97
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v5=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 88
a=0;//     .end local v3    # "outStream":Ljava/io/ByteArrayOutputStream;
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 89
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     :goto_1
a=0;//     :try_start_4
a=0;//     #v0=(Reference,Ljava/lang/Exception;);v1=(Reference,Ljava/io/ObjectOutputStream;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "Could not write serialized object to byte array: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4, v0}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     throw v4
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     .line 91
a=0;//     .end local v0    # "e":Ljava/lang/Exception;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     :goto_2
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 94
a=0;//     :try_start_5
a=0;//     invoke-virtual {v1}, Ljava/io/ObjectOutputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
a=0;// 
a=0;//     .line 97
a=0;//     :cond_1
a=0;//     :goto_3
a=0;//     throw v4
a=0;// 
a=0;//     .line 95
a=0;//     .restart local v3    # "outStream":Ljava/io/ByteArrayOutputStream;
a=0;//     :catch_1
a=0;//     #v0=(Uninit);v1=(Null);v2=(Reference,Ljava/io/ObjectOutputStream;);v3=(Reference,Ljava/io/ByteArrayOutputStream;);v5=(Uninit);
a=0;//     move-exception v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .end local v3    # "outStream":Ljava/io/ByteArrayOutputStream;
a=0;//     :catch_2
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/io/ObjectOutputStream;);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 91
a=0;//     .end local v1    # "objOutStream":Ljava/io/ObjectOutputStream;
a=0;//     .restart local v2    # "objOutStream":Ljava/io/ObjectOutputStream;
a=0;//     .restart local v3    # "outStream":Ljava/io/ByteArrayOutputStream;
a=0;//     :catchall_1
a=0;//     #v0=(Uninit);v1=(Null);v2=(Reference,Ljava/io/ObjectOutputStream;);v3=(Reference,Ljava/io/ByteArrayOutputStream;);v4=(Uninit);v5=(Uninit);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .end local v2    # "objOutStream":Ljava/io/ObjectOutputStream;
a=0;//     .restart local v1    # "objOutStream":Ljava/io/ObjectOutputStream;
a=0;//     #v1=(Reference,Ljava/io/ObjectOutputStream;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 88
a=0;//     .end local v1    # "objOutStream":Ljava/io/ObjectOutputStream;
a=0;//     .restart local v2    # "objOutStream":Ljava/io/ObjectOutputStream;
a=0;//     :catch_3
a=0;//     #v1=(Null);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .end local v2    # "objOutStream":Ljava/io/ObjectOutputStream;
a=0;//     .restart local v1    # "objOutStream":Ljava/io/ObjectOutputStream;
a=0;//     #v1=(Reference,Ljava/io/ObjectOutputStream;);
a=0;//     goto :goto_1
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
a=0;//     .line 48
a=0;//     new-instance v0, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/sql/SQLException;);
a=0;//     const-string v1, "Default values for serializable types are not supported"
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
a=0;//     .line 130
a=0;//     new-instance v0, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/sql/SQLException;);
a=0;//     const-string v1, "Serializable type cannot be converted from string to Java"
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
a=0;//     .line 53
a=0;//     invoke-interface {p2, p3}, Lcom/j256/ormlite/support/DatabaseResults;->getBytes(I)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public sqlArgToJava(Lcom/j256/ormlite/field/FieldType;Ljava/lang/Object;I)Ljava/lang/Object;
a=0;//     .locals 6
a=0;//     .param p1, "fieldType"    # Lcom/j256/ormlite/field/FieldType;
a=0;//     .param p2, "sqlArg"    # Ljava/lang/Object;
a=0;//     .param p3, "columnPos"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     check-cast p2, [B
a=0;// 
a=0;//     .end local p2    # "sqlArg":Ljava/lang/Object;
a=0;//     move-object v0, p2
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     check-cast v0, [B
a=0;// 
a=0;//     .line 59
a=0;//     .local v0, "bytes":[B
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 61
a=0;//     .local v2, "objInStream":Ljava/io/ObjectInputStream;
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     new-instance v3, Ljava/io/ObjectInputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/ObjectInputStream;);
a=0;//     new-instance v4, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-direct {v4, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     invoke-direct {v3, v4}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 62
a=0;//     .end local v2    # "objInStream":Ljava/io/ObjectInputStream;
a=0;//     .local v3, "objInStream":Ljava/io/ObjectInputStream;
a=0;//     :try_start_1
a=0;//     #v3=(Reference,Ljava/io/ObjectInputStream;);
a=0;//     invoke-virtual {v3}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 67
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 70
a=0;//     :try_start_2
a=0;//     invoke-virtual {v3}, Ljava/io/ObjectInputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     .line 73
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v5=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 63
a=0;//     .end local v3    # "objInStream":Ljava/io/ObjectInputStream;
a=0;//     .restart local v2    # "objInStream":Ljava/io/ObjectInputStream;
a=0;//     :catch_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 64
a=0;//     .local v1, "e":Ljava/lang/Exception;
a=0;//     :goto_1
a=0;//     :try_start_3
a=0;//     #v1=(Reference,Ljava/lang/Exception;);v2=(Reference,Ljava/io/ObjectInputStream;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "Could not read serialized object from byte array: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v0}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "(len "
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     array-length v5, v0
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ")"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4, v1}, Lcom/j256/ormlite/misc/SqlExceptionUtil;->create(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     throw v4
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_0
a=0;// 
a=0;//     .line 67
a=0;//     .end local v1    # "e":Ljava/lang/Exception;
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     :goto_2
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 70
a=0;//     :try_start_4
a=0;//     invoke-virtual {v2}, Ljava/io/ObjectInputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
a=0;// 
a=0;//     .line 73
a=0;//     :cond_1
a=0;//     :goto_3
a=0;//     throw v4
a=0;// 
a=0;//     .line 71
a=0;//     .end local v2    # "objInStream":Ljava/io/ObjectInputStream;
a=0;//     .restart local v3    # "objInStream":Ljava/io/ObjectInputStream;
a=0;//     :catch_1
a=0;//     #v1=(Uninit);v2=(Null);v3=(Reference,Ljava/io/ObjectInputStream;);v5=(Uninit);
a=0;//     move-exception v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .end local v3    # "objInStream":Ljava/io/ObjectInputStream;
a=0;//     .restart local v2    # "objInStream":Ljava/io/ObjectInputStream;
a=0;//     :catch_2
a=0;//     #v1=(Conflicted);v2=(Reference,Ljava/io/ObjectInputStream;);v3=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/IOException;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 67
a=0;//     .end local v2    # "objInStream":Ljava/io/ObjectInputStream;
a=0;//     .restart local v3    # "objInStream":Ljava/io/ObjectInputStream;
a=0;//     :catchall_1
a=0;//     #v1=(Uninit);v2=(Null);v3=(Reference,Ljava/io/ObjectInputStream;);v5=(Uninit);
a=0;//     move-exception v4
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .end local v3    # "objInStream":Ljava/io/ObjectInputStream;
a=0;//     .restart local v2    # "objInStream":Ljava/io/ObjectInputStream;
a=0;//     #v2=(Reference,Ljava/io/ObjectInputStream;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 63
a=0;//     .end local v2    # "objInStream":Ljava/io/ObjectInputStream;
a=0;//     .restart local v3    # "objInStream":Ljava/io/ObjectInputStream;
a=0;//     :catch_3
a=0;//     #v2=(Null);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .end local v3    # "objInStream":Ljava/io/ObjectInputStream;
a=0;//     .restart local v2    # "objInStream":Ljava/io/ObjectInputStream;
a=0;//     #v2=(Reference,Ljava/io/ObjectInputStream;);
a=0;//     goto :goto_1
a=0;// .end method
}}
