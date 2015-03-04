package com.j256.ormlite.android.apptools; class OrmLiteConfigUtil { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/android/apptools/OrmLiteConfigUtil;
a=0;// .super Ljava/lang/Object;
a=0;// .source "OrmLiteConfigUtil.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field protected static final RAW_DIR_NAME:Ljava/lang/String; = "raw"
a=0;// 
a=0;// .field protected static final RESOURCE_DIR_NAME:Ljava/lang/String; = "res"
a=0;// 
a=0;// .field private static final databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;// .field protected static maxFindSourceLevel:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     const/16 v0, 0x14
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     sput v0, Lcom/j256/ormlite/android/apptools/OrmLiteConfigUtil;->maxFindSourceLevel:I
a=0;// 
a=0;//     .line 73
a=0;//     new-instance v0, Lcom/j256/ormlite/db/SqliteAndroidDatabaseType;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/db/SqliteAndroidDatabaseType;);
a=0;//     invoke-direct {v0}, Lcom/j256/ormlite/db/SqliteAndroidDatabaseType;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/db/SqliteAndroidDatabaseType;);
a=0;//     sput-object v0, Lcom/j256/ormlite/android/apptools/OrmLiteConfigUtil;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/j256/ormlite/android/apptools/OrmLiteConfigUtil;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static classHasAnnotations(Ljava/lang/Class;)Z
a=0;//     .locals 10
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 240
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v7=(Null);v8=(Conflicted);
a=0;//     if-eqz p0, :cond_3
a=0;// 
a=0;//     .line 241
a=0;//     const-class v8, Lcom/j256/ormlite/table/DatabaseTable;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {p0, v8}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     if-eqz v8, :cond_1
a=0;// 
a=0;//     .line 269
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v5=(Conflicted);v6=(Boolean);v8=(Conflicted);v9=(Conflicted);
a=0;//     return v6
a=0;// 
a=0;//     .line 246
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v5=(Uninit);v6=(One);v8=(Reference,Ljava/lang/annotation/Annotation;);v9=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 253
a=0;//     .local v2, "fields":[Ljava/lang/reflect/Field;
a=0;//     #v2=(Reference,[Ljava/lang/reflect/Field;);
a=0;//     move-object v0, v2
a=0;// 
a=0;//     .local v0, "arr$":[Ljava/lang/reflect/Field;
a=0;//     #v0=(Reference,[Ljava/lang/reflect/Field;);
a=0;//     array-length v4, v0
a=0;// 
a=0;//     .local v4, "len$":I
a=0;//     #v4=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i$":I
a=0;//     :goto_2
a=0;//     #v3=(Integer);
a=0;//     if-ge v3, v4, :cond_2
a=0;// 
a=0;//     aget-object v1, v0, v3
a=0;// 
a=0;//     .line 254
a=0;//     .local v1, "field":Ljava/lang/reflect/Field;
a=0;//     #v1=(Null);
a=0;//     const-class v8, Lcom/j256/ormlite/field/DatabaseField;
a=0;// 
a=0;//     invoke-virtual {v1, v8}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     if-nez v8, :cond_0
a=0;// 
a=0;//     const-class v8, Lcom/j256/ormlite/field/ForeignCollectionField;
a=0;// 
a=0;//     invoke-virtual {v1, v8}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     if-nez v8, :cond_0
a=0;// 
a=0;//     .line 253
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 247
a=0;//     .end local v0    # "arr$":[Ljava/lang/reflect/Field;
a=0;//     .end local v1    # "field":Ljava/lang/reflect/Field;
a=0;//     .end local v2    # "fields":[Ljava/lang/reflect/Field;
a=0;//     .end local v3    # "i$":I
a=0;//     .end local v4    # "len$":I
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     .line 249
a=0;//     .local v5, "t":Ljava/lang/Throwable;
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v6, Ljava/lang/System;->err:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v6=(Reference,Ljava/io/PrintStream;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "Could not load get delcared fields from: "
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v6, v8}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 250
a=0;//     sget-object v6, Ljava/lang/System;->err:Ljava/io/PrintStream;
a=0;// 
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "     "
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v6, v8}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     move v6, v7
a=0;// 
a=0;//     .line 251
a=0;//     #v6=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 260
a=0;//     .end local v5    # "t":Ljava/lang/Throwable;
a=0;//     .restart local v0    # "arr$":[Ljava/lang/reflect/Field;
a=0;//     .restart local v2    # "fields":[Ljava/lang/reflect/Field;
a=0;//     .restart local v3    # "i$":I
a=0;//     .restart local v4    # "len$":I
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Reference,[Ljava/lang/reflect/Field;);v2=(Reference,[Ljava/lang/reflect/Field;);v3=(Integer);v4=(Integer);v5=(Uninit);v6=(One);v9=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 261
a=0;//     :catch_1
a=0;//     move-exception v5
a=0;// 
a=0;//     .line 263
a=0;//     .restart local v5    # "t":Ljava/lang/Throwable;
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v6, Ljava/lang/System;->err:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v6=(Reference,Ljava/io/PrintStream;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "Could not get super class for: "
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v6, v8}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 264
a=0;//     sget-object v6, Ljava/lang/System;->err:Ljava/io/PrintStream;
a=0;// 
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "     "
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v6, v8}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     move v6, v7
a=0;// 
a=0;//     .line 265
a=0;//     #v6=(Null);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .end local v0    # "arr$":[Ljava/lang/reflect/Field;
a=0;//     .end local v2    # "fields":[Ljava/lang/reflect/Field;
a=0;//     .end local v3    # "i$":I
a=0;//     .end local v4    # "len$":I
a=0;//     .end local v5    # "t":Ljava/lang/Throwable;
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Uninit);v6=(One);v8=(Conflicted);v9=(Uninit);
a=0;//     move v6, v7
a=0;// 
a=0;//     .line 269
a=0;//     #v6=(Null);
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static findAnnotatedClasses(Ljava/io/BufferedWriter;Ljava/io/File;I)V
a=0;//     .locals 12
a=0;//     .param p0, "writer"    # Ljava/io/BufferedWriter;
a=0;//     .param p1, "dir"    # Ljava/io/File;
a=0;//     .param p2, "level"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;,
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 179
a=0;//     invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "arr$":[Ljava/io/File;
a=0;//     #v0=(Reference,[Ljava/io/File;);
a=0;//     array-length v5, v0
a=0;// 
a=0;//     .local v5, "len$":I
a=0;//     #v5=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .local v4, "i$":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Integer);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     if-ge v4, v5, :cond_3
a=0;// 
a=0;//     aget-object v3, v0, v4
a=0;// 
a=0;//     .line 180
a=0;//     .local v3, "file":Ljava/io/File;
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_1
a=0;// 
a=0;//     .line 182
a=0;//     sget v9, Lcom/j256/ormlite/android/apptools/OrmLiteConfigUtil;->maxFindSourceLevel:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-ge p2, v9, :cond_0
a=0;// 
a=0;//     .line 183
a=0;//     add-int/lit8 v9, p2, 0x1
a=0;// 
a=0;//     invoke-static {p0, v3, v9}, Lcom/j256/ormlite/android/apptools/OrmLiteConfigUtil;->findAnnotatedClasses(Ljava/io/BufferedWriter;Ljava/io/File;I)V
a=0;// 
a=0;//     .line 179
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v9=(Conflicted);
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 188
a=0;//     :cond_1
a=0;//     #v9=(Boolean);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const-string v10, ".java"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_0
a=0;// 
a=0;//     .line 191
a=0;//     invoke-static {v3}, Lcom/j256/ormlite/android/apptools/OrmLiteConfigUtil;->getPackageOfClass(Ljava/io/File;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 192
a=0;//     .local v7, "packageName":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     if-nez v7, :cond_2
a=0;// 
a=0;//     .line 193
a=0;//     sget-object v9, Ljava/lang/System;->err:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v9=(Reference,Ljava/io/PrintStream;);
a=0;//     new-instance v10, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v11, "Could not find package name for: "
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 197
a=0;//     :cond_2
a=0;//     #v9=(Boolean);v11=(Conflicted);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 198
a=0;//     .local v6, "name":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     invoke-virtual {v6}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     const-string v11, ".java"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v11}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     sub-int/2addr v10, v11
a=0;// 
a=0;//     invoke-virtual {v6, v9, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 199
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     const-string v10, "."
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 202
a=0;//     .local v1, "className":Ljava/lang/String;
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 209
a=0;//     .local v2, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     #v2=(Reference,Ljava/lang/Class;);
a=0;//     invoke-static {v2}, Lcom/j256/ormlite/android/apptools/OrmLiteConfigUtil;->classHasAnnotations(Ljava/lang/Class;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_0
a=0;// 
a=0;//     .line 210
a=0;//     invoke-static {p0, v2}, Lcom/j256/ormlite/android/apptools/OrmLiteConfigUtil;->writeConfigForTable(Ljava/io/BufferedWriter;Ljava/lang/Class;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 203
a=0;//     .end local v2    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-exception v8
a=0;// 
a=0;//     .line 205
a=0;//     .local v8, "t":Ljava/lang/Throwable;
a=0;//     #v8=(Reference,Ljava/lang/Throwable;);
a=0;//     sget-object v9, Ljava/lang/System;->err:Ljava/io/PrintStream;
a=0;// 
a=0;//     new-instance v10, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v11, "Could not load class file for: "
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 206
a=0;//     sget-object v9, Ljava/lang/System;->err:Ljava/io/PrintStream;
a=0;// 
a=0;//     new-instance v10, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v11, "     "
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 213
a=0;//     .end local v1    # "className":Ljava/lang/String;
a=0;//     .end local v3    # "file":Ljava/io/File;
a=0;//     .end local v6    # "name":Ljava/lang/String;
a=0;//     .end local v7    # "packageName":Ljava/lang/String;
a=0;//     .end local v8    # "t":Ljava/lang/Throwable;
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected static findRawDir(Ljava/io/File;)Ljava/io/File;
a=0;//     .locals 3
a=0;//     .param p0, "dir"    # Ljava/io/File;
a=0;// 
a=0;//     .prologue
a=0;//     .line 158
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     if-eqz p0, :cond_1
a=0;// 
a=0;//     const/16 v2, 0x14
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ge v0, v2, :cond_1
a=0;// 
a=0;//     .line 159
a=0;//     invoke-static {p0}, Lcom/j256/ormlite/android/apptools/OrmLiteConfigUtil;->findResRawDir(Ljava/io/File;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 160
a=0;//     .local v1, "rawDir":Ljava/io/File;
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 165
a=0;//     .end local v1    # "rawDir":Ljava/io/File;
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 163
a=0;//     .restart local v1    # "rawDir":Ljava/io/File;
a=0;//     :cond_0
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;
a=0;// 
a=0;//     move-result-object p0
a=0;// 
a=0;//     .line 158
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 165
a=0;//     .end local v1    # "rawDir":Ljava/io/File;
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static findResRawDir(Ljava/io/File;)Ljava/io/File;
a=0;//     .locals 7
a=0;//     .param p0, "dir"    # Ljava/io/File;
a=0;// 
a=0;//     .prologue
a=0;//     .line 301
a=0;//     invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "arr$":[Ljava/io/File;
a=0;//     #v0=(Reference,[Ljava/io/File;);
a=0;//     array-length v3, v0
a=0;// 
a=0;//     .local v3, "len$":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i$":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-ge v2, v3, :cond_1
a=0;// 
a=0;//     aget-object v1, v0, v2
a=0;// 
a=0;//     .line 302
a=0;//     .local v1, "file":Ljava/io/File;
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "res"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 303
a=0;//     new-instance v5, Lcom/j256/ormlite/android/apptools/OrmLiteConfigUtil$1;
a=0;// 
a=0;//     #v5=(UninitRef,Lcom/j256/ormlite/android/apptools/OrmLiteConfigUtil$1;);
a=0;//     invoke-direct {v5}, Lcom/j256/ormlite/android/apptools/OrmLiteConfigUtil$1;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Lcom/j256/ormlite/android/apptools/OrmLiteConfigUtil$1;);
a=0;//     invoke-virtual {v1, v5}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 308
a=0;//     .local v4, "rawFiles":[Ljava/io/File;
a=0;//     #v4=(Reference,[Ljava/io/File;);
a=0;//     array-length v5, v4
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     if-ne v5, v6, :cond_0
a=0;// 
a=0;//     .line 309
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     aget-object v5, v4, v5
a=0;// 
a=0;//     .line 313
a=0;//     .end local v1    # "file":Ljava/io/File;
a=0;//     .end local v4    # "rawFiles":[Ljava/io/File;
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     return-object v5
a=0;// 
a=0;//     .line 301
a=0;//     .restart local v1    # "file":Ljava/io/File;
a=0;//     :cond_0
a=0;//     #v1=(Null);v5=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 313
a=0;//     .end local v1    # "file":Ljava/io/File;
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v5=(Conflicted);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static getPackageOfClass(Ljava/io/File;)Ljava/lang/String;
a=0;//     .locals 6
a=0;//     .param p0, "file"    # Ljava/io/File;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 278
a=0;//     #v5=(One);
a=0;//     new-instance v2, Ljava/io/BufferedReader;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/BufferedReader;);
a=0;//     new-instance v3, Ljava/io/FileReader;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/FileReader;);
a=0;//     invoke-direct {v3, p0}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/FileReader;);
a=0;//     invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
a=0;// 
a=0;//     .line 281
a=0;//     .local v2, "reader":Ljava/io/BufferedReader;
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Ljava/io/BufferedReader;);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 282
a=0;//     .local v0, "line":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 283
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 293
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v3
a=0;// 
a=0;//     .line 285
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v3=(Conflicted);
a=0;//     const-string v3, "package"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 286
a=0;//     const-string v3, "[ \t;]"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 287
a=0;//     .local v1, "parts":[Ljava/lang/String;
a=0;//     #v1=(Reference,[Ljava/lang/String;);
a=0;//     array-length v3, v1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-le v3, v5, :cond_0
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aget-object v3, v1, v3
a=0;// 
a=0;//     const-string v4, "package"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 288
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     aget-object v3, v1, v3
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 293
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .end local v0    # "line":Ljava/lang/String;
a=0;//     .end local v1    # "parts":[Ljava/lang/String;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
a=0;// 
a=0;//     throw v3
a=0;// .end method
a=0;// 
a=0;// .method public static main([Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p0, "args"    # [Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     array-length v0, p0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 80
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "Main can take a single file-name argument."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 82
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     aget-object v0, p0, v0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/j256/ormlite/android/apptools/OrmLiteConfigUtil;->writeConfigFile(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 83
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static writeConfigFile(Ljava/io/File;)V
a=0;//     .locals 4
a=0;//     .param p0, "configFile"    # Ljava/io/File;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;,
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/PrintStream;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Writing configurations to "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 104
a=0;//     new-instance v0, Ljava/io/BufferedWriter;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/BufferedWriter;);
a=0;//     new-instance v1, Ljava/io/FileWriter;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/FileWriter;);
a=0;//     invoke-direct {v1, p0}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/FileWriter;);
a=0;//     const/16 v2, 0x1000
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-direct {v0, v1, v2}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;I)V
a=0;// 
a=0;//     .line 106
a=0;//     .local v0, "writer":Ljava/io/BufferedWriter;
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/io/BufferedWriter;);
a=0;//     invoke-static {v0}, Lcom/j256/ormlite/android/apptools/OrmLiteConfigUtil;->writeHeader(Ljava/io/BufferedWriter;)V
a=0;// 
a=0;//     .line 107
a=0;//     new-instance v1, Ljava/io/File;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/File;);
a=0;//     const-string v2, "."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0, v1, v2}, Lcom/j256/ormlite/android/apptools/OrmLiteConfigUtil;->findAnnotatedClasses(Ljava/io/BufferedWriter;Ljava/io/File;I)V
a=0;// 
a=0;//     .line 108
a=0;//     sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;
a=0;// 
a=0;//     const-string v2, "Done."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 110
a=0;//     invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V
a=0;// 
a=0;//     .line 112
a=0;//     return-void
a=0;// 
a=0;//     .line 110
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/io/BufferedWriter;->close()V
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public static writeConfigFile(Ljava/io/File;[Ljava/lang/Class;)V
a=0;//     .locals 3
a=0;//     .param p0, "configFile"    # Ljava/io/File;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/io/File;",
a=0;//             "[",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;,
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 132
a=0;//     .local p1, "classes":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
a=0;//     sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/PrintStream;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Writing configurations to "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 133
a=0;//     new-instance v0, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v0, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileOutputStream;);
a=0;//     invoke-static {v0, p1}, Lcom/j256/ormlite/android/apptools/OrmLiteConfigUtil;->writeConfigFile(Ljava/io/OutputStream;[Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 134
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static writeConfigFile(Ljava/io/OutputStream;[Ljava/lang/Class;)V
a=0;//     .locals 7
a=0;//     .param p0, "outputStream"    # Ljava/io/OutputStream;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/io/OutputStream;",
a=0;//             "[",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;,
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 140
a=0;//     .local p1, "classes":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
a=0;//     new-instance v4, Ljava/io/BufferedWriter;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/BufferedWriter;);
a=0;//     new-instance v5, Ljava/io/OutputStreamWriter;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/io/OutputStreamWriter;);
a=0;//     invoke-direct {v5, p0}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/io/OutputStreamWriter;);
a=0;//     const/16 v6, 0x1000
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     invoke-direct {v4, v5, v6}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;I)V
a=0;// 
a=0;//     .line 142
a=0;//     .local v4, "writer":Ljava/io/BufferedWriter;
a=0;//     :try_start_0
a=0;//     #v4=(Reference,Ljava/io/BufferedWriter;);
a=0;//     invoke-static {v4}, Lcom/j256/ormlite/android/apptools/OrmLiteConfigUtil;->writeHeader(Ljava/io/BufferedWriter;)V
a=0;// 
a=0;//     .line 143
a=0;//     move-object v0, p1
a=0;// 
a=0;//     .local v0, "arr$":[Ljava/lang/Class;
a=0;//     #v0=(Reference,[Ljava/lang/Class;);
a=0;//     array-length v3, v0
a=0;// 
a=0;//     .local v3, "len$":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i$":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Integer);
a=0;//     if-ge v2, v3, :cond_0
a=0;// 
a=0;//     aget-object v1, v0, v2
a=0;// 
a=0;//     .line 144
a=0;//     .local v1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     #v1=(Null);
a=0;//     invoke-static {v4, v1}, Lcom/j256/ormlite/android/apptools/OrmLiteConfigUtil;->writeConfigForTable(Ljava/io/BufferedWriter;Ljava/lang/Class;)V
a=0;// 
a=0;//     .line 143
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 147
a=0;//     .end local v1    # "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v5, Ljava/lang/System;->out:Ljava/io/PrintStream;
a=0;// 
a=0;//     const-string v6, "Done."
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 149
a=0;//     invoke-virtual {v4}, Ljava/io/BufferedWriter;->close()V
a=0;// 
a=0;//     .line 151
a=0;//     return-void
a=0;// 
a=0;//     .line 149
a=0;//     .end local v0    # "arr$":[Ljava/lang/Class;
a=0;//     .end local v2    # "i$":I
a=0;//     .end local v3    # "len$":I
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/io/BufferedWriter;->close()V
a=0;// 
a=0;//     throw v5
a=0;// .end method
a=0;// 
a=0;// .method public static writeConfigFile(Ljava/lang/String;)V
a=0;//     .locals 4
a=0;//     .param p0, "fileName"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;,
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     const-string v3, "."
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v2}, Lcom/j256/ormlite/android/apptools/OrmLiteConfigUtil;->findRawDir(Ljava/io/File;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 91
a=0;//     .local v1, "rawDir":Ljava/io/File;
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 92
a=0;//     sget-object v2, Ljava/lang/System;->err:Ljava/io/PrintStream;
a=0;// 
a=0;//     const-string v3, "Could not find raw directory"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 97
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 94
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, v1, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 95
a=0;//     .local v0, "configFile":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v0}, Lcom/j256/ormlite/android/apptools/OrmLiteConfigUtil;->writeConfigFile(Ljava/io/File;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static writeConfigFile(Ljava/lang/String;[Ljava/lang/Class;)V
a=0;//     .locals 5
a=0;//     .param p0, "fileName"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "[",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;,
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 118
a=0;//     .local p1, "classes":[Ljava/lang/Class;, "[Ljava/lang/Class<*>;"
a=0;//     new-instance v2, Ljava/io/File;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/File;);
a=0;//     const-string v3, "."
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 119
a=0;//     .local v2, "rootDir":Ljava/io/File;
a=0;//     #v2=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v2}, Lcom/j256/ormlite/android/apptools/OrmLiteConfigUtil;->findRawDir(Ljava/io/File;)Ljava/io/File;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 120
a=0;//     .local v1, "rawDir":Ljava/io/File;
a=0;//     #v1=(Reference,Ljava/io/File;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 121
a=0;//     sget-object v3, Ljava/lang/System;->err:Ljava/io/PrintStream;
a=0;// 
a=0;//     const-string v4, "Could not find raw directory"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 126
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 123
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v4=(Uninit);
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v0, v1, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 124
a=0;//     .local v0, "configFile":Ljava/io/File;
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     invoke-static {v0, p1}, Lcom/j256/ormlite/android/apptools/OrmLiteConfigUtil;->writeConfigFile(Ljava/io/File;[Ljava/lang/Class;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static writeConfigForTable(Ljava/io/BufferedWriter;Ljava/lang/Class;)V
a=0;//     .locals 12
a=0;//     .param p0, "writer"    # Ljava/io/BufferedWriter;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/io/BufferedWriter;",
a=0;//             "Ljava/lang/Class",
a=0;//             "<*>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;,
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 216
a=0;//     .local p1, "clazz":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     invoke-static {p1}, Lcom/j256/ormlite/table/DatabaseTableConfig;->extractTableName(Ljava/lang/Class;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 217
a=0;//     .local v7, "tableName":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 219
a=0;//     .local v3, "fieldConfigs":Ljava/util/List;, "Ljava/util/List<Lcom/j256/ormlite/field/DatabaseFieldConfig;>;"
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object v8, p1
a=0;// 
a=0;//     .local v8, "working":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Reference,Ljava/lang/Class;);v9=(Conflicted);
a=0;//     if-eqz v8, :cond_2
a=0;// 
a=0;//     .line 220
a=0;//     invoke-virtual {v8}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "arr$":[Ljava/lang/reflect/Field;
a=0;//     #v0=(Reference,[Ljava/lang/reflect/Field;);
a=0;//     array-length v5, v0
a=0;// 
a=0;//     .local v5, "len$":I
a=0;//     #v5=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .local v4, "i$":I
a=0;//     :goto_1
a=0;//     #v4=(Integer);
a=0;//     if-ge v4, v5, :cond_1
a=0;// 
a=0;//     aget-object v1, v0, v4
a=0;// 
a=0;//     .line 221
a=0;//     .local v1, "field":Ljava/lang/reflect/Field;
a=0;//     #v1=(Null);
a=0;//     sget-object v9, Lcom/j256/ormlite/android/apptools/OrmLiteConfigUtil;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     #v9=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     invoke-static {v9, v7, v1}, Lcom/j256/ormlite/field/DatabaseFieldConfig;->fromField(Lcom/j256/ormlite/db/DatabaseType;Ljava/lang/String;Ljava/lang/reflect/Field;)Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 222
a=0;//     .local v2, "fieldConfig":Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;//     #v2=(Reference,Lcom/j256/ormlite/field/DatabaseFieldConfig;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 223
a=0;//     invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 220
a=0;//     :cond_0
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 219
a=0;//     .end local v1    # "field":Ljava/lang/reflect/Field;
a=0;//     .end local v2    # "fieldConfig":Lcom/j256/ormlite/field/DatabaseFieldConfig;
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v9=(Conflicted);
a=0;//     invoke-virtual {v8}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 227
a=0;//     .end local v0    # "arr$":[Ljava/lang/reflect/Field;
a=0;//     .end local v4    # "i$":I
a=0;//     .end local v5    # "len$":I
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_3
a=0;// 
a=0;//     .line 228
a=0;//     sget-object v9, Ljava/lang/System;->out:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v9=(Reference,Ljava/io/PrintStream;);
a=0;//     new-instance v10, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v11, "Skipping "
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     const-string v11, " because no annotated fields found"
a=0;// 
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 237
a=0;//     :goto_2
a=0;//     #v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 232
a=0;//     :cond_3
a=0;//     #v6=(Uninit);v9=(Boolean);v10=(Uninit);v11=(Uninit);
a=0;//     new-instance v6, Lcom/j256/ormlite/table/DatabaseTableConfig;
a=0;// 
a=0;//     #v6=(UninitRef,Lcom/j256/ormlite/table/DatabaseTableConfig;);
a=0;//     invoke-direct {v6, p1, v7, v3}, Lcom/j256/ormlite/table/DatabaseTableConfig;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/util/List;)V
a=0;// 
a=0;//     .line 233
a=0;//     .local v6, "tableConfig":Lcom/j256/ormlite/table/DatabaseTableConfig;, "Lcom/j256/ormlite/table/DatabaseTableConfig<*>;"
a=0;//     #v6=(Reference,Lcom/j256/ormlite/table/DatabaseTableConfig;);
a=0;//     invoke-static {p0, v6}, Lcom/j256/ormlite/table/DatabaseTableConfigLoader;->write(Ljava/io/BufferedWriter;Lcom/j256/ormlite/table/DatabaseTableConfig;)V
a=0;// 
a=0;//     .line 234
a=0;//     const-string v9, "#################################"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v9}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 235
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 236
a=0;//     sget-object v9, Ljava/lang/System;->out:Ljava/io/PrintStream;
a=0;// 
a=0;//     new-instance v10, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v11, "Wrote config for "
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private static writeHeader(Ljava/io/BufferedWriter;)V
a=0;//     .locals 4
a=0;//     .param p0, "writer"    # Ljava/io/BufferedWriter;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v3, 0x23
a=0;// 
a=0;//     .line 169
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {p0, v3}, Ljava/io/BufferedWriter;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     .line 170
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 171
a=0;//     const-string v0, "# generated on "
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Ljava/io/BufferedWriter;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljava/text/SimpleDateFormat;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/text/SimpleDateFormat;);
a=0;//     const-string v2, "yyyy/MM/dd hh:mm:ss"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/text/SimpleDateFormat;);
a=0;//     new-instance v2, Ljava/util/Date;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/Date;);
a=0;//     invoke-direct {v2}, Ljava/util/Date;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Date;);
a=0;//     invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/io/Writer;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;
a=0;// 
a=0;//     .line 172
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 173
a=0;//     invoke-virtual {p0, v3}, Ljava/io/BufferedWriter;->append(C)Ljava/io/Writer;
a=0;// 
a=0;//     .line 174
a=0;//     invoke-virtual {p0}, Ljava/io/BufferedWriter;->newLine()V
a=0;// 
a=0;//     .line 175
a=0;//     return-void
a=0;// .end method
}}
