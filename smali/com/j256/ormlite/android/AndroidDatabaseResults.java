package com.j256.ormlite.android; class AndroidDatabaseResults { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/android/AndroidDatabaseResults;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AndroidDatabaseResults.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/j256/ormlite/support/DatabaseResults;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final MIN_NUM_COLUMN_NAMES_MAP:I = 0x8
a=0;// 
a=0;// .field private static final databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final columnNameMap:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/Integer;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final columnNames:[Ljava/lang/String;
a=0;// 
a=0;// .field private final cursor:Landroid/database/Cursor;
a=0;// 
a=0;// .field private final objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     new-instance v0, Lcom/j256/ormlite/db/SqliteAndroidDatabaseType;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/j256/ormlite/db/SqliteAndroidDatabaseType;);
a=0;//     invoke-direct {v0}, Lcom/j256/ormlite/db/SqliteAndroidDatabaseType;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/db/SqliteAndroidDatabaseType;);
a=0;//     sput-object v0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/database/Cursor;Lcom/j256/ormlite/dao/ObjectCache;)V
a=0;//     .locals 4
a=0;//     .param p1, "cursor"    # Landroid/database/Cursor;
a=0;//     .param p2, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 35
a=0;//     #p0=(Reference,Lcom/j256/ormlite/android/AndroidDatabaseResults;);
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->cursor:Landroid/database/Cursor;
a=0;// 
a=0;//     .line 36
a=0;//     invoke-interface {p1}, Landroid/database/Cursor;->getColumnNames()[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/String;);
a=0;//     iput-object v1, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->columnNames:[Ljava/lang/String;
a=0;// 
a=0;//     .line 37
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->columnNames:[Ljava/lang/String;
a=0;// 
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_0
a=0;// 
a=0;//     .line 38
a=0;//     new-instance v1, Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v1, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->columnNameMap:Ljava/util/Map;
a=0;// 
a=0;//     .line 39
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->columnNames:[Ljava/lang/String;
a=0;// 
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_1
a=0;// 
a=0;//     .line 41
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->columnNameMap:Ljava/util/Map;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->columnNames:[Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     aget-object v2, v2, v0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 39
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 44
a=0;//     .end local v0    # "i":I
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Integer);v2=(PosByte);v3=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-object v1, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->columnNameMap:Ljava/util/Map;
a=0;// 
a=0;//     .line 46
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Integer);v3=(Conflicted);
a=0;//     iput-object p2, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     .line 47
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/database/Cursor;ZLcom/j256/ormlite/dao/ObjectCache;)V
a=0;//     .locals 0
a=0;//     .param p1, "cursor"    # Landroid/database/Cursor;
a=0;//     .param p2, "firstCall"    # Z
a=0;//     .param p3, "objectCache"    # Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     .annotation runtime Ljava/lang/Deprecated;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     invoke-direct {p0, p1, p3}, Lcom/j256/ormlite/android/AndroidDatabaseResults;-><init>(Landroid/database/Cursor;Lcom/j256/ormlite/dao/ObjectCache;)V
a=0;// 
a=0;//     .line 57
a=0;//     #p0=(Reference,Lcom/j256/ormlite/android/AndroidDatabaseResults;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private lookupColumn(Ljava/lang/String;)I
a=0;//     .locals 4
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .line 226
a=0;//     #v2=(Byte);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->columnNameMap:Ljava/util/Map;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Map;);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     .line 227
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->columnNames:[Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/String;);
a=0;//     array-length v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v0, v3, :cond_1
a=0;// 
a=0;//     .line 229
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->columnNames:[Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/String;);
a=0;//     aget-object v3, v3, v0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 240
a=0;//     .end local v0    # "i":I
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 227
a=0;//     .restart local v0    # "i":I
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v3=(Boolean);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v3=(Integer);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 233
a=0;//     #v0=(Byte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 236
a=0;//     .end local v0    # "i":I
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v3=(Reference,Ljava/util/Map;);
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->columnNameMap:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/lang/Integer;
a=0;// 
a=0;//     .line 237
a=0;//     .local v1, "index":Ljava/lang/Integer;
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 238
a=0;//     #v0=(Byte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 240
a=0;//     :cond_3
a=0;//     #v0=(Uninit);
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public close()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 205
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->cursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 206
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public closeQuietly()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 209
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/android/AndroidDatabaseResults;->close()V
a=0;// 
a=0;//     .line 210
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public findColumn(Ljava/lang/String;)I
a=0;//     .locals 7
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 111
a=0;//     invoke-direct {p0, p1}, Lcom/j256/ormlite/android/AndroidDatabaseResults;->lookupColumn(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 112
a=0;//     .local v1, "index":I
a=0;//     #v1=(Integer);
a=0;//     if-ltz v1, :cond_0
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 125
a=0;//     .end local v1    # "index":I
a=0;//     .local v2, "index":I
a=0;//     :goto_0
a=0;//     #v2=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 121
a=0;//     .end local v2    # "index":I
a=0;//     .restart local v1    # "index":I
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v4, v4, 0x4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 122
a=0;//     .local v3, "sb":Ljava/lang/StringBuilder;
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v4, Lcom/j256/ormlite/android/AndroidDatabaseResults;->databaseType:Lcom/j256/ormlite/db/DatabaseType;
a=0;// 
a=0;//     #v4=(Reference,Lcom/j256/ormlite/db/DatabaseType;);
a=0;//     invoke-interface {v4, v3, p1}, Lcom/j256/ormlite/db/DatabaseType;->appendEscapedEntityName(Ljava/lang/StringBuilder;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 123
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {p0, v4}, Lcom/j256/ormlite/android/AndroidDatabaseResults;->lookupColumn(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 124
a=0;//     if-ltz v1, :cond_1
a=0;// 
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 125
a=0;//     .end local v1    # "index":I
a=0;//     .restart local v2    # "index":I
a=0;//     #v2=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 127
a=0;//     .end local v2    # "index":I
a=0;//     .restart local v1    # "index":I
a=0;//     :cond_1
a=0;//     #v2=(Uninit);
a=0;//     iget-object v4, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->cursor:Landroid/database/Cursor;
a=0;// 
a=0;//     invoke-interface {v4}, Landroid/database/Cursor;->getColumnNames()[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 128
a=0;//     .local v0, "columnNames":[Ljava/lang/String;
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     new-instance v4, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "Unknown field \'"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "\' from the Android sqlite cursor, not in:"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v4
a=0;// .end method
a=0;// 
a=0;// .method public first()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->cursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getBigDecimal(I)Ljava/math/BigDecimal;
a=0;//     .locals 2
a=0;//     .param p1, "columnIndex"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 193
a=0;//     new-instance v0, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/sql/SQLException;);
a=0;//     const-string v1, "Android does not support BigDecimal type.  Use BIG_DECIMAL or BIG_DECIMAL_STRING types"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public getBlobStream(I)Ljava/io/InputStream;
a=0;//     .locals 2
a=0;//     .param p1, "columnIndex"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 189
a=0;//     new-instance v0, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     iget-object v1, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->cursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v1=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v1, p1}, Landroid/database/Cursor;->getBlob(I)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getBoolean(I)Z
a=0;//     .locals 1
a=0;//     .param p1, "columnIndex"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 138
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->cursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v0, p1}, Landroid/database/Cursor;->isNull(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->cursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v0, p1}, Landroid/database/Cursor;->getShort(I)S
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Short);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 139
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 141
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Short);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getByte(I)B
a=0;//     .locals 1
a=0;//     .param p1, "columnIndex"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 157
a=0;//     invoke-virtual {p0, p1}, Lcom/j256/ormlite/android/AndroidDatabaseResults;->getShort(I)S
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Short);
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getBytes(I)[B
a=0;//     .locals 1
a=0;//     .param p1, "columnIndex"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->cursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v0, p1}, Landroid/database/Cursor;->getBlob(I)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getChar(I)C
a=0;//     .locals 4
a=0;//     .param p1, "columnIndex"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 146
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->cursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v2=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v2, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 147
a=0;//     .local v0, "string":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 150
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Char);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 149
a=0;//     :cond_1
a=0;//     #v1=(Null);v2=(Integer);v3=(Uninit);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     if-ne v2, v3, :cond_2
a=0;// 
a=0;//     .line 150
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Char);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 152
a=0;//     :cond_2
a=0;//     #v1=(Null);
a=0;//     new-instance v1, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/sql/SQLException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "More than 1 character stored in database column: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public getColumnCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->cursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->getColumnCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getColumnNames()[Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     invoke-virtual {p0}, Lcom/j256/ormlite/android/AndroidDatabaseResults;->getColumnCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 65
a=0;//     .local v1, "colN":I
a=0;//     #v1=(Integer);
a=0;//     new-array v2, v1, [Ljava/lang/String;
a=0;// 
a=0;//     .line 66
a=0;//     .local v2, "columnNames":[Ljava/lang/String;
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "colC":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 67
a=0;//     iget-object v3, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->cursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v3=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v3, v0}, Landroid/database/Cursor;->getColumnName(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     aput-object v3, v2, v0
a=0;// 
a=0;//     .line 66
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 69
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method public getCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 100
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->cursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->getCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getDouble(I)D
a=0;//     .locals 2
a=0;//     .param p1, "columnIndex"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 181
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->cursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v0, p1}, Landroid/database/Cursor;->getDouble(I)D
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getFloat(I)F
a=0;//     .locals 1
a=0;//     .param p1, "columnIndex"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 177
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->cursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v0, p1}, Landroid/database/Cursor;->getFloat(I)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getInt(I)I
a=0;//     .locals 1
a=0;//     .param p1, "columnIndex"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 169
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->cursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v0, p1}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getLong(I)J
a=0;//     .locals 2
a=0;//     .param p1, "columnIndex"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 173
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->cursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v0, p1}, Landroid/database/Cursor;->getLong(I)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getObjectCache()Lcom/j256/ormlite/dao/ObjectCache;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 201
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->objectCache:Lcom/j256/ormlite/dao/ObjectCache;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/dao/ObjectCache;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getPosition()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 107
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->cursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->getPosition()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getRawCursor()Landroid/database/Cursor;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 216
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->cursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getShort(I)S
a=0;//     .locals 1
a=0;//     .param p1, "columnIndex"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 165
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->cursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v0, p1}, Landroid/database/Cursor;->getShort(I)S
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Short);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getString(I)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p1, "columnIndex"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 134
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->cursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v0, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTimestamp(I)Ljava/sql/Timestamp;
a=0;//     .locals 2
a=0;//     .param p1, "columnIndex"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/sql/SQLException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 185
a=0;//     new-instance v0, Ljava/sql/SQLException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/sql/SQLException;);
a=0;//     const-string v1, "Android does not support timestamp.  Use JAVA_DATE_LONG or JAVA_DATE_STRING types"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/sql/SQLException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public last()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->cursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->moveToLast()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public moveAbsolute(I)Z
a=0;//     .locals 1
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->cursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v0, p1}, Landroid/database/Cursor;->moveToPosition(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public moveRelative(I)Z
a=0;//     .locals 1
a=0;//     .param p1, "offset"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->cursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v0, p1}, Landroid/database/Cursor;->move(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public next()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->cursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public previous()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->cursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->moveToPrevious()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 221
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "@"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-super {p0}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public wasNull(I)Z
a=0;//     .locals 1
a=0;//     .param p1, "columnIndex"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 197
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/android/AndroidDatabaseResults;->cursor:Landroid/database/Cursor;
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-interface {v0, p1}, Landroid/database/Cursor;->isNull(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
