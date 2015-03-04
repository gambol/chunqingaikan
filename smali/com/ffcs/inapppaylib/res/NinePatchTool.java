package com.ffcs.inapppaylib.res; class NinePatchTool { void a() { int a;
a=0;// .class public Lcom/ffcs/inapppaylib/res/NinePatchTool;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NinePatchTool.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final NO_COLOR:I = 0x1
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 24
a=0;//     #p0=(Reference,Lcom/ffcs/inapppaylib/res/NinePatchTool;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static dealPaddingInfo(Landroid/graphics/Bitmap;[B)V
a=0;//     .locals 11
a=0;//     .param p0, "bm"    # Landroid/graphics/Bitmap;
a=0;//     .param p1, "data"    # [B
a=0;// 
a=0;//     .prologue
a=0;//     .line 150
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, -0x2
a=0;// 
a=0;//     new-array v1, v0, [I
a=0;// 
a=0;//     .line 151
a=0;//     .local v1, "bottomPixels":[I
a=0;//     #v1=(Reference,[I);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     array-length v3, v1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 152
a=0;//     #v4=(One);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     add-int/lit8 v5, v0, -0x1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     array-length v6, v1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     .line 151
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V
a=0;// 
a=0;//     .line 153
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .local v10, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Integer);v10=(Integer);
a=0;//     array-length v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v10, v0, :cond_0
a=0;// 
a=0;//     .line 159
a=0;//     :goto_1
a=0;//     array-length v0, v1
a=0;// 
a=0;//     add-int/lit8 v10, v0, -0x1
a=0;// 
a=0;//     :goto_2
a=0;//     if-gez v10, :cond_2
a=0;// 
a=0;//     .line 167
a=0;//     :goto_3
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     add-int/lit8 v0, v0, -0x2
a=0;// 
a=0;//     new-array v3, v0, [I
a=0;// 
a=0;//     .line 168
a=0;//     .local v3, "rightPixels":[I
a=0;//     #v3=(Reference,[I);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     add-int/lit8 v6, v0, -0x1
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     .line 169
a=0;//     #v8=(One);
a=0;//     array-length v9, v3
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     move-object v2, p0
a=0;// 
a=0;//     .line 168
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual/range {v2 .. v9}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V
a=0;// 
a=0;//     .line 170
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     :goto_4
a=0;//     #v2=(Conflicted);
a=0;//     array-length v0, v3
a=0;// 
a=0;//     if-lt v10, v0, :cond_4
a=0;// 
a=0;//     .line 176
a=0;//     :goto_5
a=0;//     array-length v0, v3
a=0;// 
a=0;//     add-int/lit8 v10, v0, -0x1
a=0;// 
a=0;//     :goto_6
a=0;//     if-gez v10, :cond_6
a=0;// 
a=0;//     .line 183
a=0;//     :goto_7
a=0;//     return-void
a=0;// 
a=0;//     .line 154
a=0;//     .end local v3    # "rightPixels":[I
a=0;//     :cond_0
a=0;//     #v2=(Integer);v3=(Integer);v4=(One);v5=(Integer);v7=(One);v8=(Uninit);v9=(Uninit);
a=0;//     const/high16 v0, -0x1000000
a=0;// 
a=0;//     aget v2, v1, v10
a=0;// 
a=0;//     if-ne v0, v2, :cond_1
a=0;// 
a=0;//     .line 155
a=0;//     const/16 v0, 0xc
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {p1, v0, v10}, Lcom/ffcs/inapppaylib/res/NinePatchTool;->writeInt([BII)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 153
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v10, v10, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 160
a=0;//     :cond_2
a=0;//     const/high16 v0, -0x1000000
a=0;// 
a=0;//     aget v2, v1, v10
a=0;// 
a=0;//     if-ne v0, v2, :cond_3
a=0;// 
a=0;//     .line 161
a=0;//     const/16 v0, 0x10
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     array-length v2, v1
a=0;// 
a=0;//     sub-int/2addr v2, v10
a=0;// 
a=0;//     add-int/lit8 v2, v2, -0x2
a=0;// 
a=0;//     invoke-static {p1, v0, v2}, Lcom/ffcs/inapppaylib/res/NinePatchTool;->writeInt([BII)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 159
a=0;//     :cond_3
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v10, v10, -0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 171
a=0;//     .restart local v3    # "rightPixels":[I
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);v3=(Reference,[I);v4=(Null);v5=(One);v7=(Null);v8=(One);v9=(Integer);
a=0;//     const/high16 v0, -0x1000000
a=0;// 
a=0;//     aget v2, v3, v10
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v0, v2, :cond_5
a=0;// 
a=0;//     .line 172
a=0;//     const/16 v0, 0x14
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {p1, v0, v10}, Lcom/ffcs/inapppaylib/res/NinePatchTool;->writeInt([BII)V
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 170
a=0;//     :cond_5
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v10, v10, 0x1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 177
a=0;//     :cond_6
a=0;//     #v2=(Conflicted);
a=0;//     const/high16 v0, -0x1000000
a=0;// 
a=0;//     aget v2, v3, v10
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v0, v2, :cond_7
a=0;// 
a=0;//     .line 178
a=0;//     const/16 v0, 0x18
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     array-length v2, v3
a=0;// 
a=0;//     sub-int/2addr v2, v10
a=0;// 
a=0;//     add-int/lit8 v2, v2, -0x2
a=0;// 
a=0;//     invoke-static {p1, v0, v2}, Lcom/ffcs/inapppaylib/res/NinePatchTool;->writeInt([BII)V
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 176
a=0;//     :cond_7
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v10, v10, -0x1
a=0;// 
a=0;//     goto :goto_6
a=0;// .end method
a=0;// 
a=0;// .method public static decodeFromAsset(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;//     .locals 3
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "ninePatchPngPath"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/AssetManager;);
a=0;//     invoke-virtual {v2, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 54
a=0;//     .local v1, "is":Ljava/io/InputStream;
a=0;//     #v1=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-static {v1}, Lcom/ffcs/inapppaylib/res/NinePatchTool;->decodeFromStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 55
a=0;//     .local v0, "bm":Landroid/graphics/Bitmap;
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 56
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static decodeFromFile(Ljava/lang/String;)Landroid/graphics/Bitmap;
a=0;//     .locals 2
a=0;//     .param p0, "path"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     new-instance v1, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 46
a=0;//     .local v1, "in":Ljava/io/InputStream;
a=0;//     #v1=(Reference,Ljava/io/FileInputStream;);
a=0;//     invoke-static {v1}, Lcom/ffcs/inapppaylib/res/NinePatchTool;->decodeFromStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 47
a=0;//     .local v0, "bm":Landroid/graphics/Bitmap;
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v1}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 48
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static decodeFromStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
a=0;//     .locals 8
a=0;//     .param p0, "in"    # Ljava/io/InputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 28
a=0;//     #v7=(One);
a=0;//     invoke-static {p0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 29
a=0;//     .local v3, "srcBm":Landroid/graphics/Bitmap;
a=0;//     #v3=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-static {v3}, Lcom/ffcs/inapppaylib/res/NinePatchTool;->readChunk(Landroid/graphics/Bitmap;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 30
a=0;//     .local v0, "chunk":[B
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-static {v0}, Landroid/graphics/NinePatch;->isNinePatchChunk([B)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 31
a=0;//     .local v2, "isNinePatchChunk":Z
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 33
a=0;//     invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/lit8 v5, v5, -0x2
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v6, v6, -0x2
a=0;// 
a=0;//     .line 32
a=0;//     invoke-static {v3, v7, v7, v5, v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 34
a=0;//     .local v4, "tgtBm":Landroid/graphics/Bitmap;
a=0;//     #v4=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V
a=0;// 
a=0;//     .line 35
a=0;//     invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     const-string v6, "mNinePatchChunk"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 36
a=0;//     .local v1, "f":Ljava/lang/reflect/Field;
a=0;//     #v1=(Reference,Ljava/lang/reflect/Field;);
a=0;//     invoke-virtual {v1, v7}, Ljava/lang/reflect/Field;->setAccessible(Z)V
a=0;// 
a=0;//     .line 37
a=0;//     invoke-virtual {v1, v4, v0}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 40
a=0;//     .end local v1    # "f":Ljava/lang/reflect/Field;
a=0;//     .end local v4    # "tgtBm":Landroid/graphics/Bitmap;
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     move-object v4, v3
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Bitmap;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static getInt([BI)I
a=0;//     .locals 7
a=0;//     .param p0, "bs"    # [B
a=0;//     .param p1, "from"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 200
a=0;//     add-int/lit8 v5, p1, 0x0
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     aget-byte v0, p0, v5
a=0;// 
a=0;//     .line 201
a=0;//     .local v0, "b1":I
a=0;//     #v0=(Byte);
a=0;//     add-int/lit8 v5, p1, 0x1
a=0;// 
a=0;//     aget-byte v1, p0, v5
a=0;// 
a=0;//     .line 202
a=0;//     .local v1, "b2":I
a=0;//     #v1=(Byte);
a=0;//     add-int/lit8 v5, p1, 0x2
a=0;// 
a=0;//     aget-byte v2, p0, v5
a=0;// 
a=0;//     .line 203
a=0;//     .local v2, "b3":I
a=0;//     #v2=(Byte);
a=0;//     add-int/lit8 v5, p1, 0x3
a=0;// 
a=0;//     aget-byte v3, p0, v5
a=0;// 
a=0;//     .line 204
a=0;//     .local v3, "b4":I
a=0;//     #v3=(Byte);
a=0;//     shl-int/lit8 v5, v1, 0x8
a=0;// 
a=0;//     or-int/2addr v5, v0
a=0;// 
a=0;//     shl-int/lit8 v6, v2, 0x10
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     or-int/2addr v5, v6
a=0;// 
a=0;//     shl-int/lit8 v6, v3, 0x18
a=0;// 
a=0;//     or-int v4, v5, v6
a=0;// 
a=0;//     .line 205
a=0;//     .local v4, "i":I
a=0;//     #v4=(Integer);
a=0;//     return v4
a=0;// .end method
a=0;// 
a=0;// .method public static printChunkInfo(Landroid/graphics/Bitmap;)V
a=0;//     .locals 14
a=0;//     .param p0, "bm"    # Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .prologue
a=0;//     .line 210
a=0;//     invoke-virtual {p0}, Landroid/graphics/Bitmap;->getNinePatchChunk()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 211
a=0;//     .local v1, "chunk":[B
a=0;//     #v1=(Reference,[B);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 212
a=0;//     sget-object v11, Ljava/lang/System;->out:Ljava/io/PrintStream;
a=0;// 
a=0;//     #v11=(Reference,Ljava/io/PrintStream;);
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v13, "can\'t find chunk info from this bitmap("
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v12, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 213
a=0;//     const-string v13, ")"
a=0;// 
a=0;//     invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 212
a=0;//     invoke-virtual {v11, v12}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 252
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v13=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 216
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     #v11=(One);
a=0;//     aget-byte v9, v1, v11
a=0;// 
a=0;//     .line 217
a=0;//     .local v9, "xLen":I
a=0;//     #v9=(Byte);
a=0;//     const/4 v11, 0x2
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     aget-byte v10, v1, v11
a=0;// 
a=0;//     .line 218
a=0;//     .local v10, "yLen":I
a=0;//     #v10=(Byte);
a=0;//     const/4 v11, 0x3
a=0;// 
a=0;//     aget-byte v0, v1, v11
a=0;// 
a=0;//     .line 220
a=0;//     .local v0, "cLen":I
a=0;//     #v0=(Byte);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 221
a=0;//     .local v7, "sb":Ljava/lang/StringBuilder;
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/16 v11, 0xc
a=0;// 
a=0;//     invoke-static {v1, v11}, Lcom/ffcs/inapppaylib/res/NinePatchTool;->getInt([BI)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 222
a=0;//     .local v6, "peddingLeft":I
a=0;//     #v6=(Integer);
a=0;//     const/16 v11, 0x10
a=0;// 
a=0;//     invoke-static {v1, v11}, Lcom/ffcs/inapppaylib/res/NinePatchTool;->getInt([BI)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 223
a=0;//     .local v4, "paddingRight":I
a=0;//     #v4=(Integer);
a=0;//     const/16 v11, 0x14
a=0;// 
a=0;//     invoke-static {v1, v11}, Lcom/ffcs/inapppaylib/res/NinePatchTool;->getInt([BI)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 224
a=0;//     .local v5, "paddingTop":I
a=0;//     #v5=(Integer);
a=0;//     const/16 v11, 0x18
a=0;// 
a=0;//     invoke-static {v1, v11}, Lcom/ffcs/inapppaylib/res/NinePatchTool;->getInt([BI)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 225
a=0;//     .local v3, "paddingBottom":I
a=0;//     #v3=(Integer);
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, "peddingLeft="
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 226
a=0;//     const-string v11, "\r\n"
a=0;// 
a=0;//     invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 227
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, "paddingRight="
a=0;// 
a=0;//     invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 228
a=0;//     const-string v11, "\r\n"
a=0;// 
a=0;//     invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 229
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, "paddingTop="
a=0;// 
a=0;//     invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 230
a=0;//     const-string v11, "\r\n"
a=0;// 
a=0;//     invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 231
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, "paddingBottom="
a=0;// 
a=0;//     invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 232
a=0;//     const-string v11, "\r\n"
a=0;// 
a=0;//     invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 234
a=0;//     const-string v11, "x info="
a=0;// 
a=0;//     invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 235
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_1
a=0;//     #v2=(Integer);v8=(Conflicted);
a=0;//     if-lt v2, v9, :cond_1
a=0;// 
a=0;//     .line 239
a=0;//     const-string v11, "\r\n"
a=0;// 
a=0;//     invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 240
a=0;//     const-string v11, "y info="
a=0;// 
a=0;//     invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 241
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_2
a=0;//     if-lt v2, v10, :cond_2
a=0;// 
a=0;//     .line 245
a=0;//     const-string v11, "\r\n"
a=0;// 
a=0;//     invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 246
a=0;//     const-string v11, "color info="
a=0;// 
a=0;//     invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 247
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :goto_3
a=0;//     if-lt v2, v0, :cond_3
a=0;// 
a=0;//     .line 251
a=0;//     sget-object v11, Ljava/lang/System;->err:Ljava/io/PrintStream;
a=0;// 
a=0;//     new-instance v12, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v12=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     invoke-virtual {v11, v12}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 236
a=0;//     :cond_1
a=0;//     mul-int/lit8 v11, v2, 0x4
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     add-int/lit8 v11, v11, 0x20
a=0;// 
a=0;//     invoke-static {v1, v11}, Lcom/ffcs/inapppaylib/res/NinePatchTool;->getInt([BI)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 237
a=0;//     .local v8, "vv":I
a=0;//     #v8=(Integer);
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, ","
a=0;// 
a=0;//     invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 235
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 242
a=0;//     .end local v8    # "vv":I
a=0;//     :cond_2
a=0;//     #v8=(Conflicted);
a=0;//     mul-int/lit8 v11, v9, 0x4
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     add-int/lit8 v11, v11, 0x20
a=0;// 
a=0;//     mul-int/lit8 v12, v2, 0x4
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     add-int/2addr v11, v12
a=0;// 
a=0;//     invoke-static {v1, v11}, Lcom/ffcs/inapppaylib/res/NinePatchTool;->getInt([BI)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 243
a=0;//     .restart local v8    # "vv":I
a=0;//     #v8=(Integer);
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, ","
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 241
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 248
a=0;//     .end local v8    # "vv":I
a=0;//     :cond_3
a=0;//     #v8=(Conflicted);
a=0;//     mul-int/lit8 v11, v9, 0x4
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     mul-int/lit8 v12, v10, 0x4
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     add-int/2addr v11, v12
a=0;// 
a=0;//     add-int/lit8 v11, v11, 0x20
a=0;// 
a=0;//     mul-int/lit8 v12, v2, 0x4
a=0;// 
a=0;//     add-int/2addr v11, v12
a=0;// 
a=0;//     invoke-static {v1, v11}, Lcom/ffcs/inapppaylib/res/NinePatchTool;->getInt([BI)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 249
a=0;//     .restart local v8    # "vv":I
a=0;//     #v8=(Integer);
a=0;//     new-instance v11, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v11=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v12, ","
a=0;// 
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 247
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public static readChunk(Landroid/graphics/Bitmap;)[B
a=0;//     .locals 28
a=0;//     .param p0, "yuantuBmp"    # Landroid/graphics/Bitmap;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getWidth()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 68
a=0;//     .local v5, "BM_W":I
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getHeight()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 70
a=0;//     .local v14, "BM_H":I
a=0;//     #v14=(Integer);
a=0;//     const/16 v25, 0x0
a=0;// 
a=0;//     .line 71
a=0;//     .local v25, "xPointCount":I
a=0;//     #v25=(Null);
a=0;//     const/16 v27, 0x0
a=0;// 
a=0;//     .line 73
a=0;//     .local v27, "yPointCount":I
a=0;//     #v27=(Null);
a=0;//     const/16 v24, 0x0
a=0;// 
a=0;//     .line 74
a=0;//     .local v24, "xBlockCount":I
a=0;//     #v24=(Null);
a=0;//     const/16 v26, 0x0
a=0;// 
a=0;//     .line 76
a=0;//     .local v26, "yBlockCount":I
a=0;//     #v26=(Null);
a=0;//     new-instance v20, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v20=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct/range {v20 .. v20}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 77
a=0;//     .local v20, "ooo":Ljava/io/ByteArrayOutputStream;
a=0;//     #v20=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     const/16 v17, 0x0
a=0;// 
a=0;//     .local v17, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v17=(Integer);
a=0;//     const/16 v2, 0x20
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v0, v2, :cond_6
a=0;// 
a=0;//     .line 82
a=0;//     add-int/lit8 v2, v5, -0x2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     new-array v3, v2, [I
a=0;// 
a=0;//     .line 83
a=0;//     .local v3, "pixelsTop":[I
a=0;//     #v3=(Reference,[I);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     add-int/lit8 v8, v5, -0x2
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     move-object/from16 v2, p0
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual/range {v2 .. v9}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V
a=0;// 
a=0;//     .line 84
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aget v2, v3, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/high16 v4, -0x1000000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v2, v4, :cond_7
a=0;// 
a=0;//     const/16 v22, 0x1
a=0;// 
a=0;//     .line 85
a=0;//     .local v22, "topFirstPixelIsBlack":Z
a=0;//     :goto_1
a=0;//     #v22=(Boolean);
a=0;//     array-length v2, v3
a=0;// 
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     aget v2, v3, v2
a=0;// 
a=0;//     const/high16 v4, -0x1000000
a=0;// 
a=0;//     if-ne v2, v4, :cond_8
a=0;// 
a=0;//     const/16 v23, 0x1
a=0;// 
a=0;//     .line 86
a=0;//     .local v23, "topLastPixelIsBlack":Z
a=0;//     :goto_2
a=0;//     #v23=(Boolean);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     .line 87
a=0;//     .local v21, "tmpLastColor":I
a=0;//     #v21=(Null);
a=0;//     const/16 v17, 0x0
a=0;// 
a=0;//     #v17=(Null);
a=0;//     array-length v0, v3
a=0;// 
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     .local v19, "len":I
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v17=(Integer);v19=(Integer);v21=(Integer);v25=(Integer);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_9
a=0;// 
a=0;//     .line 94
a=0;//     if-eqz v23, :cond_0
a=0;// 
a=0;//     .line 95
a=0;//     add-int/lit8 v25, v25, 0x1
a=0;// 
a=0;//     .line 96
a=0;//     array-length v2, v3
a=0;// 
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-static {v0, v2}, Lcom/ffcs/inapppaylib/res/NinePatchTool;->writeInt(Ljava/io/OutputStream;I)V
a=0;// 
a=0;//     .line 98
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     add-int/lit8 v24, v25, 0x1
a=0;// 
a=0;//     .line 99
a=0;//     #v24=(Integer);
a=0;//     if-eqz v22, :cond_1
a=0;// 
a=0;//     .line 100
a=0;//     add-int/lit8 v24, v24, -0x1
a=0;// 
a=0;//     .line 102
a=0;//     :cond_1
a=0;//     if-eqz v23, :cond_2
a=0;// 
a=0;//     .line 103
a=0;//     add-int/lit8 v24, v24, -0x1
a=0;// 
a=0;//     .line 108
a=0;//     :cond_2
a=0;//     add-int/lit8 v2, v14, -0x2
a=0;// 
a=0;//     new-array v7, v2, [I
a=0;// 
a=0;//     .line 109
a=0;//     .local v7, "pixelsLeft":[I
a=0;//     #v7=(Reference,[I);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     #v11=(One);
a=0;//     const/4 v12, 0x1
a=0;// 
a=0;//     #v12=(One);
a=0;//     add-int/lit8 v13, v14, -0x2
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     move-object/from16 v6, p0
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-virtual/range {v6 .. v13}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V
a=0;// 
a=0;//     .line 110
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     aget v2, v7, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/high16 v4, -0x1000000
a=0;// 
a=0;//     if-ne v2, v4, :cond_b
a=0;// 
a=0;//     const/16 v16, 0x1
a=0;// 
a=0;//     .line 111
a=0;//     .local v16, "firstPixelIsBlack":Z
a=0;//     :goto_4
a=0;//     #v16=(Boolean);
a=0;//     array-length v2, v7
a=0;// 
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     aget v2, v7, v2
a=0;// 
a=0;//     const/high16 v4, -0x1000000
a=0;// 
a=0;//     if-ne v2, v4, :cond_c
a=0;// 
a=0;//     const/16 v18, 0x1
a=0;// 
a=0;//     .line 112
a=0;//     .local v18, "lastPixelIsBlack":Z
a=0;//     :goto_5
a=0;//     #v18=(Boolean);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     .line 113
a=0;//     #v21=(Null);
a=0;//     const/16 v17, 0x0
a=0;// 
a=0;//     #v17=(Null);
a=0;//     array-length v0, v7
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     :goto_6
a=0;//     #v0=(Conflicted);v17=(Integer);v21=(Integer);v27=(Integer);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     if-lt v0, v1, :cond_d
a=0;// 
a=0;//     .line 120
a=0;//     if-eqz v18, :cond_3
a=0;// 
a=0;//     .line 121
a=0;//     add-int/lit8 v27, v27, 0x1
a=0;// 
a=0;//     .line 122
a=0;//     array-length v2, v7
a=0;// 
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-static {v0, v2}, Lcom/ffcs/inapppaylib/res/NinePatchTool;->writeInt(Ljava/io/OutputStream;I)V
a=0;// 
a=0;//     .line 124
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     add-int/lit8 v26, v27, 0x1
a=0;// 
a=0;//     .line 125
a=0;//     #v26=(Integer);
a=0;//     if-eqz v16, :cond_4
a=0;// 
a=0;//     .line 126
a=0;//     add-int/lit8 v26, v26, -0x1
a=0;// 
a=0;//     .line 128
a=0;//     :cond_4
a=0;//     if-eqz v18, :cond_5
a=0;// 
a=0;//     .line 129
a=0;//     add-int/lit8 v26, v26, -0x1
a=0;// 
a=0;//     .line 134
a=0;//     :cond_5
a=0;//     const/16 v17, 0x0
a=0;// 
a=0;//     :goto_7
a=0;//     mul-int v2, v24, v26
a=0;// 
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v0, v2, :cond_f
a=0;// 
a=0;//     .line 139
a=0;//     invoke-virtual/range {v20 .. v20}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 140
a=0;//     .local v15, "data":[B
a=0;//     #v15=(Reference,[B);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     aput-byte v4, v15, v2
a=0;// 
a=0;//     .line 141
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     int-to-byte v4, v0
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     aput-byte v4, v15, v2
a=0;// 
a=0;//     .line 142
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     int-to-byte v4, v0
a=0;// 
a=0;//     aput-byte v4, v15, v2
a=0;// 
a=0;//     .line 143
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     mul-int v4, v24, v26
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-byte v4, v4
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     aput-byte v4, v15, v2
a=0;// 
a=0;//     .line 144
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     invoke-static {v0, v15}, Lcom/ffcs/inapppaylib/res/NinePatchTool;->dealPaddingInfo(Landroid/graphics/Bitmap;[B)V
a=0;// 
a=0;//     .line 145
a=0;//     return-object v15
a=0;// 
a=0;//     .line 78
a=0;//     .end local v3    # "pixelsTop":[I
a=0;//     .end local v7    # "pixelsLeft":[I
a=0;//     .end local v15    # "data":[B
a=0;//     .end local v16    # "firstPixelIsBlack":Z
a=0;//     .end local v18    # "lastPixelIsBlack":Z
a=0;//     .end local v19    # "len":I
a=0;//     .end local v21    # "tmpLastColor":I
a=0;//     .end local v22    # "topFirstPixelIsBlack":Z
a=0;//     .end local v23    # "topLastPixelIsBlack":Z
a=0;//     :cond_6
a=0;//     #v0=(Integer);v1=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v15=(Uninit);v16=(Uninit);v18=(Uninit);v19=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Uninit);v24=(Null);v25=(Null);v26=(Null);v27=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-virtual {v0, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V
a=0;// 
a=0;//     .line 77
a=0;//     add-int/lit8 v17, v17, 0x1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 84
a=0;//     .restart local v3    # "pixelsTop":[I
a=0;//     :cond_7
a=0;//     #v0=(Integer);v2=(Integer);v3=(Reference,[I);v4=(Integer);v6=(One);v7=(Null);v8=(Integer);v9=(One);
a=0;//     const/16 v22, 0x0
a=0;// 
a=0;//     #v22=(Null);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 85
a=0;//     .restart local v22    # "topFirstPixelIsBlack":Z
a=0;//     :cond_8
a=0;//     #v22=(Boolean);
a=0;//     const/16 v23, 0x0
a=0;// 
a=0;//     #v23=(Null);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 88
a=0;//     .restart local v19    # "len":I
a=0;//     .restart local v21    # "tmpLastColor":I
a=0;//     .restart local v23    # "topLastPixelIsBlack":Z
a=0;//     :cond_9
a=0;//     #v1=(Integer);v19=(Integer);v21=(Integer);v23=(Boolean);v25=(Integer);
a=0;//     aget v2, v3, v17
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     if-eq v0, v2, :cond_a
a=0;// 
a=0;//     .line 89
a=0;//     add-int/lit8 v25, v25, 0x1
a=0;// 
a=0;//     .line 90
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     move/from16 v1, v17
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/ffcs/inapppaylib/res/NinePatchTool;->writeInt(Ljava/io/OutputStream;I)V
a=0;// 
a=0;//     .line 91
a=0;//     aget v21, v3, v17
a=0;// 
a=0;//     .line 87
a=0;//     :cond_a
a=0;//     #v0=(Conflicted);
a=0;//     add-int/lit8 v17, v17, 0x1
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 110
a=0;//     .restart local v7    # "pixelsLeft":[I
a=0;//     :cond_b
a=0;//     #v6=(Reference,Landroid/graphics/Bitmap;);v7=(Reference,[I);v8=(Null);v10=(Null);v11=(One);v12=(One);v13=(Integer);v24=(Integer);
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     #v16=(Null);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 111
a=0;//     .restart local v16    # "firstPixelIsBlack":Z
a=0;//     :cond_c
a=0;//     #v16=(Boolean);
a=0;//     const/16 v18, 0x0
a=0;// 
a=0;//     #v18=(Null);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 114
a=0;//     .restart local v18    # "lastPixelIsBlack":Z
a=0;//     :cond_d
a=0;//     #v0=(Integer);v18=(Boolean);v27=(Integer);
a=0;//     aget v2, v7, v17
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     if-eq v0, v2, :cond_e
a=0;// 
a=0;//     .line 115
a=0;//     add-int/lit8 v27, v27, 0x1
a=0;// 
a=0;//     .line 116
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     move/from16 v1, v17
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/ffcs/inapppaylib/res/NinePatchTool;->writeInt(Ljava/io/OutputStream;I)V
a=0;// 
a=0;//     .line 117
a=0;//     aget v21, v7, v17
a=0;// 
a=0;//     .line 113
a=0;//     :cond_e
a=0;//     #v0=(Conflicted);
a=0;//     add-int/lit8 v17, v17, 0x1
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     .line 135
a=0;//     :cond_f
a=0;//     #v0=(Integer);v26=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-static {v0, v2}, Lcom/ffcs/inapppaylib/res/NinePatchTool;->writeInt(Ljava/io/OutputStream;I)V
a=0;// 
a=0;//     .line 134
a=0;//     add-int/lit8 v17, v17, 0x1
a=0;// 
a=0;//     goto :goto_7
a=0;// .end method
a=0;// 
a=0;// .method public static readPaddingFromChunk([BLandroid/graphics/Rect;)V
a=0;//     .locals 1
a=0;//     .param p0, "chunk"    # [B
a=0;//     .param p1, "paddingRect"    # Landroid/graphics/Rect;
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     const/16 v0, 0xc
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {p0, v0}, Lcom/ffcs/inapppaylib/res/NinePatchTool;->getInt([BI)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p1, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     .line 61
a=0;//     const/16 v0, 0x10
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {p0, v0}, Lcom/ffcs/inapppaylib/res/NinePatchTool;->getInt([BI)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p1, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     .line 62
a=0;//     const/16 v0, 0x14
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {p0, v0}, Lcom/ffcs/inapppaylib/res/NinePatchTool;->getInt([BI)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p1, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     .line 63
a=0;//     const/16 v0, 0x18
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {p0, v0}, Lcom/ffcs/inapppaylib/res/NinePatchTool;->getInt([BI)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p1, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     .line 64
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static writeInt(Ljava/io/OutputStream;I)V
a=0;//     .locals 1
a=0;//     .param p0, "out"    # Ljava/io/OutputStream;
a=0;//     .param p1, "v"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 186
a=0;//     shr-int/lit8 v0, p1, 0x0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit16 v0, v0, 0xff
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 187
a=0;//     shr-int/lit8 v0, p1, 0x8
a=0;// 
a=0;//     and-int/lit16 v0, v0, 0xff
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 188
a=0;//     shr-int/lit8 v0, p1, 0x10
a=0;// 
a=0;//     #v0=(Short);
a=0;//     and-int/lit16 v0, v0, 0xff
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 189
a=0;//     shr-int/lit8 v0, p1, 0x18
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     and-int/lit16 v0, v0, 0xff
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 190
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static writeInt([BII)V
a=0;//     .locals 2
a=0;//     .param p0, "b"    # [B
a=0;//     .param p1, "offset"    # I
a=0;//     .param p2, "v"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 193
a=0;//     add-int/lit8 v0, p1, 0x0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     shr-int/lit8 v1, p2, 0x0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-byte v1, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     aput-byte v1, p0, v0
a=0;// 
a=0;//     .line 194
a=0;//     add-int/lit8 v0, p1, 0x1
a=0;// 
a=0;//     shr-int/lit8 v1, p2, 0x8
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-byte v1, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     aput-byte v1, p0, v0
a=0;// 
a=0;//     .line 195
a=0;//     add-int/lit8 v0, p1, 0x2
a=0;// 
a=0;//     shr-int/lit8 v1, p2, 0x10
a=0;// 
a=0;//     #v1=(Short);
a=0;//     int-to-byte v1, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     aput-byte v1, p0, v0
a=0;// 
a=0;//     .line 196
a=0;//     add-int/lit8 v0, p1, 0x3
a=0;// 
a=0;//     shr-int/lit8 v1, p2, 0x18
a=0;// 
a=0;//     int-to-byte v1, v1
a=0;// 
a=0;//     aput-byte v1, p0, v0
a=0;// 
a=0;//     .line 197
a=0;//     return-void
a=0;// .end method
}}
