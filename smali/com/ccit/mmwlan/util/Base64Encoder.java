package com.ccit.mmwlan.util; class Base64Encoder { void a() { int a;
a=0;// .class public Lcom/ccit/mmwlan/util/Base64Encoder;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Base64Encoder.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/ccit/mmwlan/util/Encoder;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected final decodingTable:[B
a=0;// 
a=0;// .field protected final encodingTable:[B
a=0;// 
a=0;// .field protected padding:B
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 10
a=0;//     #p0=(Reference,Lcom/ccit/mmwlan/util/Base64Encoder;);
a=0;//     const/16 v0, 0x40
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     .line 22
a=0;//     iput-object v0, p0, Lcom/ccit/mmwlan/util/Base64Encoder;->encodingTable:[B
a=0;// 
a=0;//     .line 25
a=0;//     const/16 v0, 0x3d
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput-byte v0, p0, Lcom/ccit/mmwlan/util/Base64Encoder;->padding:B
a=0;// 
a=0;//     .line 30
a=0;//     const/16 v0, 0x80
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     iput-object v0, p0, Lcom/ccit/mmwlan/util/Base64Encoder;->decodingTable:[B
a=0;// 
a=0;//     .line 42
a=0;//     invoke-virtual {p0}, Lcom/ccit/mmwlan/util/Base64Encoder;->initialiseDecodingTable()V
a=0;// 
a=0;//     .line 43
a=0;//     return-void
a=0;// 
a=0;//     .line 10
a=0;//     :array_0
a=0;//     .array-data 1
a=0;//         0x41t
a=0;//         0x42t
a=0;//         0x43t
a=0;//         0x44t
a=0;//         0x45t
a=0;//         0x46t
a=0;//         0x47t
a=0;//         0x48t
a=0;//         0x49t
a=0;//         0x4at
a=0;//         0x4bt
a=0;//         0x4ct
a=0;//         0x4dt
a=0;//         0x4et
a=0;//         0x4ft
a=0;//         0x50t
a=0;//         0x51t
a=0;//         0x52t
a=0;//         0x53t
a=0;//         0x54t
a=0;//         0x55t
a=0;//         0x56t
a=0;//         0x57t
a=0;//         0x58t
a=0;//         0x59t
a=0;//         0x5at
a=0;//         0x61t
a=0;//         0x62t
a=0;//         0x63t
a=0;//         0x64t
a=0;//         0x65t
a=0;//         0x66t
a=0;//         0x67t
a=0;//         0x68t
a=0;//         0x69t
a=0;//         0x6at
a=0;//         0x6bt
a=0;//         0x6ct
a=0;//         0x6dt
a=0;//         0x6et
a=0;//         0x6ft
a=0;//         0x70t
a=0;//         0x71t
a=0;//         0x72t
a=0;//         0x73t
a=0;//         0x74t
a=0;//         0x75t
a=0;//         0x76t
a=0;//         0x77t
a=0;//         0x78t
a=0;//         0x79t
a=0;//         0x7at
a=0;//         0x30t
a=0;//         0x31t
a=0;//         0x32t
a=0;//         0x33t
a=0;//         0x34t
a=0;//         0x35t
a=0;//         0x36t
a=0;//         0x37t
a=0;//         0x38t
a=0;//         0x39t
a=0;//         0x2bt
a=0;//         0x2ft
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method private decodeLastBlock(Ljava/io/OutputStream;CCCC)I
a=0;//     .locals 6
a=0;//     .param p1, "out"    # Ljava/io/OutputStream;
a=0;//     .param p2, "c1"    # C
a=0;//     .param p3, "c2"    # C
a=0;//     .param p4, "c3"    # C
a=0;//     .param p5, "c4"    # C
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 255
a=0;//     iget-byte v4, p0, Lcom/ccit/mmwlan/util/Base64Encoder;->padding:B
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-ne p4, v4, :cond_0
a=0;// 
a=0;//     .line 257
a=0;//     iget-object v4, p0, Lcom/ccit/mmwlan/util/Base64Encoder;->decodingTable:[B
a=0;// 
a=0;//     #v4=(Reference,[B);
a=0;//     aget-byte v0, v4, p2
a=0;// 
a=0;//     .line 258
a=0;//     .local v0, "b1":B
a=0;//     #v0=(Byte);
a=0;//     iget-object v4, p0, Lcom/ccit/mmwlan/util/Base64Encoder;->decodingTable:[B
a=0;// 
a=0;//     aget-byte v1, v4, p3
a=0;// 
a=0;//     .line 260
a=0;//     .local v1, "b2":B
a=0;//     #v1=(Byte);
a=0;//     shl-int/lit8 v4, v0, 0x2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     shr-int/lit8 v5, v1, 0x4
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     or-int/2addr v4, v5
a=0;// 
a=0;//     invoke-virtual {p1, v4}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 262
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 286
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(PosByte);
a=0;//     return v4
a=0;// 
a=0;//     .line 264
a=0;//     .end local v0    # "b1":B
a=0;//     .end local v1    # "b2":B
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Byte);v5=(Uninit);
a=0;//     iget-byte v4, p0, Lcom/ccit/mmwlan/util/Base64Encoder;->padding:B
a=0;// 
a=0;//     if-ne p5, v4, :cond_1
a=0;// 
a=0;//     .line 266
a=0;//     iget-object v4, p0, Lcom/ccit/mmwlan/util/Base64Encoder;->decodingTable:[B
a=0;// 
a=0;//     #v4=(Reference,[B);
a=0;//     aget-byte v0, v4, p2
a=0;// 
a=0;//     .line 267
a=0;//     .restart local v0    # "b1":B
a=0;//     #v0=(Byte);
a=0;//     iget-object v4, p0, Lcom/ccit/mmwlan/util/Base64Encoder;->decodingTable:[B
a=0;// 
a=0;//     aget-byte v1, v4, p3
a=0;// 
a=0;//     .line 268
a=0;//     .restart local v1    # "b2":B
a=0;//     #v1=(Byte);
a=0;//     iget-object v4, p0, Lcom/ccit/mmwlan/util/Base64Encoder;->decodingTable:[B
a=0;// 
a=0;//     aget-byte v2, v4, p4
a=0;// 
a=0;//     .line 270
a=0;//     .local v2, "b3":B
a=0;//     #v2=(Byte);
a=0;//     shl-int/lit8 v4, v0, 0x2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     shr-int/lit8 v5, v1, 0x4
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     or-int/2addr v4, v5
a=0;// 
a=0;//     invoke-virtual {p1, v4}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 271
a=0;//     shl-int/lit8 v4, v1, 0x4
a=0;// 
a=0;//     shr-int/lit8 v5, v2, 0x2
a=0;// 
a=0;//     or-int/2addr v4, v5
a=0;// 
a=0;//     invoke-virtual {p1, v4}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 273
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 277
a=0;//     .end local v0    # "b1":B
a=0;//     .end local v1    # "b2":B
a=0;//     .end local v2    # "b3":B
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Byte);v5=(Uninit);
a=0;//     iget-object v4, p0, Lcom/ccit/mmwlan/util/Base64Encoder;->decodingTable:[B
a=0;// 
a=0;//     #v4=(Reference,[B);
a=0;//     aget-byte v0, v4, p2
a=0;// 
a=0;//     .line 278
a=0;//     .restart local v0    # "b1":B
a=0;//     #v0=(Byte);
a=0;//     iget-object v4, p0, Lcom/ccit/mmwlan/util/Base64Encoder;->decodingTable:[B
a=0;// 
a=0;//     aget-byte v1, v4, p3
a=0;// 
a=0;//     .line 279
a=0;//     .restart local v1    # "b2":B
a=0;//     #v1=(Byte);
a=0;//     iget-object v4, p0, Lcom/ccit/mmwlan/util/Base64Encoder;->decodingTable:[B
a=0;// 
a=0;//     aget-byte v2, v4, p4
a=0;// 
a=0;//     .line 280
a=0;//     .restart local v2    # "b3":B
a=0;//     #v2=(Byte);
a=0;//     iget-object v4, p0, Lcom/ccit/mmwlan/util/Base64Encoder;->decodingTable:[B
a=0;// 
a=0;//     aget-byte v3, v4, p5
a=0;// 
a=0;//     .line 282
a=0;//     .local v3, "b4":B
a=0;//     #v3=(Byte);
a=0;//     shl-int/lit8 v4, v0, 0x2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     shr-int/lit8 v5, v1, 0x4
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     or-int/2addr v4, v5
a=0;// 
a=0;//     invoke-virtual {p1, v4}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 283
a=0;//     shl-int/lit8 v4, v1, 0x4
a=0;// 
a=0;//     shr-int/lit8 v5, v2, 0x2
a=0;// 
a=0;//     or-int/2addr v4, v5
a=0;// 
a=0;//     invoke-virtual {p1, v4}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 284
a=0;//     shl-int/lit8 v4, v2, 0x6
a=0;// 
a=0;//     or-int/2addr v4, v3
a=0;// 
a=0;//     invoke-virtual {p1, v4}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 286
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private ignore(C)Z
a=0;//     .locals 1
a=0;//     .param p1, "c"    # C
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     const/16 v0, 0xa
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     const/16 v0, 0xd
a=0;// 
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     const/16 v0, 0x9
a=0;// 
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     const/16 v0, 0x20
a=0;// 
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(PosByte);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private nextI(Ljava/lang/String;II)I
a=0;//     .locals 1
a=0;//     .param p1, "data"    # Ljava/lang/String;
a=0;//     .param p2, "i"    # I
a=0;//     .param p3, "finish"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 292
a=0;//     :goto_0
a=0;//     if-ge p2, p3, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Char);
a=0;//     invoke-direct {p0, v0}, Lcom/ccit/mmwlan/util/Base64Encoder;->ignore(C)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 296
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return p2
a=0;// 
a=0;//     .line 294
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     add-int/lit8 p2, p2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private nextI([BII)I
a=0;//     .locals 1
a=0;//     .param p1, "data"    # [B
a=0;//     .param p2, "i"    # I
a=0;//     .param p3, "finish"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 182
a=0;//     :goto_0
a=0;//     if-ge p2, p3, :cond_0
a=0;// 
a=0;//     aget-byte v0, p1, p2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     int-to-char v0, v0
a=0;// 
a=0;//     #v0=(Char);
a=0;//     invoke-direct {p0, v0}, Lcom/ccit/mmwlan/util/Base64Encoder;->ignore(C)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 186
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return p2
a=0;// 
a=0;//     .line 184
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     add-int/lit8 p2, p2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public decode(Ljava/lang/String;Ljava/io/OutputStream;)I
a=0;//     .locals 17
a=0;//     .param p1, "data"    # Ljava/lang/String;
a=0;//     .param p2, "out"    # Ljava/io/OutputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 201
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     .line 203
a=0;//     .local v16, "length":I
a=0;//     #v16=(Null);
a=0;//     invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 205
a=0;//     .local v12, "end":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v12=(Integer);
a=0;//     if-gtz v12, :cond_1
a=0;// 
a=0;//     .line 215
a=0;//     :cond_0
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     .line 216
a=0;//     .local v14, "i":I
a=0;//     #v14=(Null);
a=0;//     add-int/lit8 v13, v12, -0x4
a=0;// 
a=0;//     .line 218
a=0;//     .local v13, "finish":I
a=0;//     #v13=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/util/Base64Encoder;);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v14, v13}, Lcom/ccit/mmwlan/util/Base64Encoder;->nextI(Ljava/lang/String;II)I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     move v15, v14
a=0;// 
a=0;//     .line 220
a=0;//     .end local v14    # "i":I
a=0;//     .local v15, "i":I
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v15=(Integer);v16=(Integer);
a=0;//     if-lt v15, v13, :cond_2
a=0;// 
a=0;//     .line 245
a=0;//     add-int/lit8 v2, v12, -0x4
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Char);
a=0;//     add-int/lit8 v2, v12, -0x3
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Char);
a=0;//     add-int/lit8 v2, v12, -0x2
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Char);
a=0;//     add-int/lit8 v2, v12, -0x1
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Char);
a=0;//     move-object/from16 v2, p0
a=0;// 
a=0;//     #v2=(Reference,Lcom/ccit/mmwlan/util/Base64Encoder;);
a=0;//     move-object/from16 v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/OutputStream;);
a=0;//     invoke-direct/range {v2 .. v7}, Lcom/ccit/mmwlan/util/Base64Encoder;->decodeLastBlock(Ljava/io/OutputStream;CCCC)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int v16, v16, v2
a=0;// 
a=0;//     .line 247
a=0;//     return v16
a=0;// 
a=0;//     .line 207
a=0;//     .end local v13    # "finish":I
a=0;//     .end local v15    # "i":I
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Uninit);v2=(Conflicted);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Null);
a=0;//     add-int/lit8 v2, v12, -0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Char);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v0, v2}, Lcom/ccit/mmwlan/util/Base64Encoder;->ignore(C)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 212
a=0;//     add-int/lit8 v12, v12, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 222
a=0;//     .restart local v13    # "finish":I
a=0;//     .restart local v15    # "i":I
a=0;//     :cond_2
a=0;//     #v1=(Reference,Ljava/lang/String;);v2=(Conflicted);v3=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v13=(Integer);v14=(Integer);v15=(Integer);v16=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/ccit/mmwlan/util/Base64Encoder;->decodingTable:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     add-int/lit8 v14, v15, 0x1
a=0;// 
a=0;//     .end local v15    # "i":I
a=0;//     .restart local v14    # "i":I
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Char);
a=0;//     aget-byte v8, v2, v3
a=0;// 
a=0;//     .line 224
a=0;//     .local v8, "b1":B
a=0;//     #v8=(Byte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     invoke-direct {v0, v1, v14, v13}, Lcom/ccit/mmwlan/util/Base64Encoder;->nextI(Ljava/lang/String;II)I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 226
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/ccit/mmwlan/util/Base64Encoder;->decodingTable:[B
a=0;// 
a=0;//     add-int/lit8 v15, v14, 0x1
a=0;// 
a=0;//     .end local v14    # "i":I
a=0;//     .restart local v15    # "i":I
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     aget-byte v9, v2, v3
a=0;// 
a=0;//     .line 228
a=0;//     .local v9, "b2":B
a=0;//     #v9=(Byte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     invoke-direct {v0, v1, v15, v13}, Lcom/ccit/mmwlan/util/Base64Encoder;->nextI(Ljava/lang/String;II)I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 230
a=0;//     .end local v15    # "i":I
a=0;//     .restart local v14    # "i":I
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/ccit/mmwlan/util/Base64Encoder;->decodingTable:[B
a=0;// 
a=0;//     add-int/lit8 v15, v14, 0x1
a=0;// 
a=0;//     .end local v14    # "i":I
a=0;//     .restart local v15    # "i":I
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     aget-byte v10, v2, v3
a=0;// 
a=0;//     .line 232
a=0;//     .local v10, "b3":B
a=0;//     #v10=(Byte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     invoke-direct {v0, v1, v15, v13}, Lcom/ccit/mmwlan/util/Base64Encoder;->nextI(Ljava/lang/String;II)I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 234
a=0;//     .end local v15    # "i":I
a=0;//     .restart local v14    # "i":I
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/ccit/mmwlan/util/Base64Encoder;->decodingTable:[B
a=0;// 
a=0;//     add-int/lit8 v15, v14, 0x1
a=0;// 
a=0;//     .end local v14    # "i":I
a=0;//     .restart local v15    # "i":I
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v14}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     aget-byte v11, v2, v3
a=0;// 
a=0;//     .line 236
a=0;//     .local v11, "b4":B
a=0;//     #v11=(Byte);
a=0;//     shl-int/lit8 v2, v8, 0x2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     shr-int/lit8 v3, v9, 0x4
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     or-int/2addr v2, v3
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 237
a=0;//     shl-int/lit8 v2, v9, 0x4
a=0;// 
a=0;//     shr-int/lit8 v3, v10, 0x2
a=0;// 
a=0;//     or-int/2addr v2, v3
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 238
a=0;//     shl-int/lit8 v2, v10, 0x6
a=0;// 
a=0;//     or-int/2addr v2, v11
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 240
a=0;//     add-int/lit8 v16, v16, 0x3
a=0;// 
a=0;//     .line 242
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     invoke-direct {v0, v1, v15, v13}, Lcom/ccit/mmwlan/util/Base64Encoder;->nextI(Ljava/lang/String;II)I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .end local v15    # "i":I
a=0;//     .restart local v14    # "i":I
a=0;//     move v15, v14
a=0;// 
a=0;//     .end local v14    # "i":I
a=0;//     .restart local v15    # "i":I
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public decode([BIILjava/io/OutputStream;)I
a=0;//     .locals 17
a=0;//     .param p1, "data"    # [B
a=0;//     .param p2, "off"    # I
a=0;//     .param p3, "length"    # I
a=0;//     .param p4, "out"    # Ljava/io/OutputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     .line 133
a=0;//     .local v16, "outLen":I
a=0;//     #v16=(Null);
a=0;//     add-int v12, p2, p3
a=0;// 
a=0;//     .line 135
a=0;//     .local v12, "end":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v12=(Integer);
a=0;//     move/from16 v0, p2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gt v12, v0, :cond_1
a=0;// 
a=0;//     .line 145
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     move/from16 v14, p2
a=0;// 
a=0;//     .line 146
a=0;//     .local v14, "i":I
a=0;//     #v14=(Integer);
a=0;//     add-int/lit8 v13, v12, -0x4
a=0;// 
a=0;//     .line 148
a=0;//     .local v13, "finish":I
a=0;//     #v13=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/util/Base64Encoder;);
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     invoke-direct {v0, v1, v14, v13}, Lcom/ccit/mmwlan/util/Base64Encoder;->nextI([BII)I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     move v15, v14
a=0;// 
a=0;//     .line 150
a=0;//     .end local v14    # "i":I
a=0;//     .local v15, "i":I
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v15=(Integer);v16=(Integer);
a=0;//     if-lt v15, v13, :cond_2
a=0;// 
a=0;//     .line 175
a=0;//     add-int/lit8 v2, v12, -0x4
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aget-byte v2, p1, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     int-to-char v4, v2
a=0;// 
a=0;//     #v4=(Char);
a=0;//     add-int/lit8 v2, v12, -0x3
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aget-byte v2, p1, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     int-to-char v5, v2
a=0;// 
a=0;//     #v5=(Char);
a=0;//     add-int/lit8 v2, v12, -0x2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aget-byte v2, p1, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     int-to-char v6, v2
a=0;// 
a=0;//     #v6=(Char);
a=0;//     add-int/lit8 v2, v12, -0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aget-byte v2, p1, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     int-to-char v7, v2
a=0;// 
a=0;//     #v7=(Char);
a=0;//     move-object/from16 v2, p0
a=0;// 
a=0;//     #v2=(Reference,Lcom/ccit/mmwlan/util/Base64Encoder;);
a=0;//     move-object/from16 v3, p4
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/OutputStream;);
a=0;//     invoke-direct/range {v2 .. v7}, Lcom/ccit/mmwlan/util/Base64Encoder;->decodeLastBlock(Ljava/io/OutputStream;CCCC)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int v16, v16, v2
a=0;// 
a=0;//     .line 177
a=0;//     return v16
a=0;// 
a=0;//     .line 137
a=0;//     .end local v13    # "finish":I
a=0;//     .end local v15    # "i":I
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Conflicted);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Null);
a=0;//     add-int/lit8 v2, v12, -0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aget-byte v2, p1, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     int-to-char v2, v2
a=0;// 
a=0;//     #v2=(Char);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/util/Base64Encoder;);
a=0;//     invoke-direct {v0, v2}, Lcom/ccit/mmwlan/util/Base64Encoder;->ignore(C)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 142
a=0;//     add-int/lit8 v12, v12, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 152
a=0;//     .restart local v13    # "finish":I
a=0;//     .restart local v15    # "i":I
a=0;//     :cond_2
a=0;//     #v1=(Reference,[B);v2=(Conflicted);v3=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v13=(Integer);v14=(Integer);v15=(Integer);v16=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/ccit/mmwlan/util/Base64Encoder;->decodingTable:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     add-int/lit8 v14, v15, 0x1
a=0;// 
a=0;//     .end local v15    # "i":I
a=0;//     .restart local v14    # "i":I
a=0;//     aget-byte v3, p1, v15
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     aget-byte v8, v2, v3
a=0;// 
a=0;//     .line 154
a=0;//     .local v8, "b1":B
a=0;//     #v8=(Byte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     invoke-direct {v0, v1, v14, v13}, Lcom/ccit/mmwlan/util/Base64Encoder;->nextI([BII)I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 156
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/ccit/mmwlan/util/Base64Encoder;->decodingTable:[B
a=0;// 
a=0;//     add-int/lit8 v15, v14, 0x1
a=0;// 
a=0;//     .end local v14    # "i":I
a=0;//     .restart local v15    # "i":I
a=0;//     aget-byte v3, p1, v14
a=0;// 
a=0;//     aget-byte v9, v2, v3
a=0;// 
a=0;//     .line 158
a=0;//     .local v9, "b2":B
a=0;//     #v9=(Byte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     invoke-direct {v0, v1, v15, v13}, Lcom/ccit/mmwlan/util/Base64Encoder;->nextI([BII)I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 160
a=0;//     .end local v15    # "i":I
a=0;//     .restart local v14    # "i":I
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/ccit/mmwlan/util/Base64Encoder;->decodingTable:[B
a=0;// 
a=0;//     add-int/lit8 v15, v14, 0x1
a=0;// 
a=0;//     .end local v14    # "i":I
a=0;//     .restart local v15    # "i":I
a=0;//     aget-byte v3, p1, v14
a=0;// 
a=0;//     aget-byte v10, v2, v3
a=0;// 
a=0;//     .line 162
a=0;//     .local v10, "b3":B
a=0;//     #v10=(Byte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     invoke-direct {v0, v1, v15, v13}, Lcom/ccit/mmwlan/util/Base64Encoder;->nextI([BII)I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 164
a=0;//     .end local v15    # "i":I
a=0;//     .restart local v14    # "i":I
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Lcom/ccit/mmwlan/util/Base64Encoder;->decodingTable:[B
a=0;// 
a=0;//     add-int/lit8 v15, v14, 0x1
a=0;// 
a=0;//     .end local v14    # "i":I
a=0;//     .restart local v15    # "i":I
a=0;//     aget-byte v3, p1, v14
a=0;// 
a=0;//     aget-byte v11, v2, v3
a=0;// 
a=0;//     .line 166
a=0;//     .local v11, "b4":B
a=0;//     #v11=(Byte);
a=0;//     shl-int/lit8 v2, v8, 0x2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     shr-int/lit8 v3, v9, 0x4
a=0;// 
a=0;//     or-int/2addr v2, v3
a=0;// 
a=0;//     move-object/from16 v0, p4
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 167
a=0;//     shl-int/lit8 v2, v9, 0x4
a=0;// 
a=0;//     shr-int/lit8 v3, v10, 0x2
a=0;// 
a=0;//     or-int/2addr v2, v3
a=0;// 
a=0;//     move-object/from16 v0, p4
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 168
a=0;//     shl-int/lit8 v2, v10, 0x6
a=0;// 
a=0;//     or-int/2addr v2, v11
a=0;// 
a=0;//     move-object/from16 v0, p4
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 170
a=0;//     add-int/lit8 v16, v16, 0x3
a=0;// 
a=0;//     .line 172
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     invoke-direct {v0, v1, v15, v13}, Lcom/ccit/mmwlan/util/Base64Encoder;->nextI([BII)I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .end local v15    # "i":I
a=0;//     .restart local v14    # "i":I
a=0;//     move v15, v14
a=0;// 
a=0;//     .end local v14    # "i":I
a=0;//     .restart local v15    # "i":I
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public encode([BIILjava/io/OutputStream;)I
a=0;//     .locals 15
a=0;//     .param p1, "data"    # [B
a=0;//     .param p2, "off"    # I
a=0;//     .param p3, "length"    # I
a=0;//     .param p4, "out"    # Ljava/io/OutputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     rem-int/lit8 v11, p3, 0x3
a=0;// 
a=0;//     .line 58
a=0;//     .local v11, "modulus":I
a=0;//     #v11=(Integer);
a=0;//     sub-int v9, p3, v11
a=0;// 
a=0;//     .line 61
a=0;//     .local v9, "dataLength":I
a=0;//     #v9=(Integer);
a=0;//     move/from16 v10, p2
a=0;// 
a=0;//     .local v10, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v10=(Integer);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);
a=0;//     add-int v12, p2, v9
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     if-lt v10, v12, :cond_0
a=0;// 
a=0;//     .line 79
a=0;//     packed-switch v11, :pswitch_data_0
a=0;// 
a=0;//     .line 108
a=0;//     :goto_1
a=0;//     :pswitch_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     div-int/lit8 v12, v9, 0x3
a=0;// 
a=0;//     mul-int/lit8 v13, v12, 0x4
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     if-nez v11, :cond_1
a=0;// 
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     :goto_2
a=0;//     #v12=(PosByte);
a=0;//     add-int/2addr v12, v13
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     return v12
a=0;// 
a=0;//     .line 63
a=0;//     :cond_0
a=0;//     #v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v13=(Conflicted);
a=0;//     aget-byte v12, p1, v10
a=0;// 
a=0;//     #v12=(Byte);
a=0;//     and-int/lit16 v1, v12, 0xff
a=0;// 
a=0;//     .line 64
a=0;//     .local v1, "a1":I
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v12, v10, 0x1
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     aget-byte v12, p1, v12
a=0;// 
a=0;//     #v12=(Byte);
a=0;//     and-int/lit16 v2, v12, 0xff
a=0;// 
a=0;//     .line 65
a=0;//     .local v2, "a2":I
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v12, v10, 0x2
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     aget-byte v12, p1, v12
a=0;// 
a=0;//     #v12=(Byte);
a=0;//     and-int/lit16 v3, v12, 0xff
a=0;// 
a=0;//     .line 67
a=0;//     .local v3, "a3":I
a=0;//     #v3=(Integer);
a=0;//     iget-object v12, p0, Lcom/ccit/mmwlan/util/Base64Encoder;->encodingTable:[B
a=0;// 
a=0;//     #v12=(Reference,[B);
a=0;//     ushr-int/lit8 v13, v1, 0x2
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     and-int/lit8 v13, v13, 0x3f
a=0;// 
a=0;//     aget-byte v12, v12, v13
a=0;// 
a=0;//     #v12=(Byte);
a=0;//     move-object/from16 v0, p4
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/OutputStream;);
a=0;//     invoke-virtual {v0, v12}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 68
a=0;//     iget-object v12, p0, Lcom/ccit/mmwlan/util/Base64Encoder;->encodingTable:[B
a=0;// 
a=0;//     #v12=(Reference,[B);
a=0;//     shl-int/lit8 v13, v1, 0x4
a=0;// 
a=0;//     ushr-int/lit8 v14, v2, 0x4
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     or-int/2addr v13, v14
a=0;// 
a=0;//     and-int/lit8 v13, v13, 0x3f
a=0;// 
a=0;//     aget-byte v12, v12, v13
a=0;// 
a=0;//     #v12=(Byte);
a=0;//     move-object/from16 v0, p4
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 69
a=0;//     iget-object v12, p0, Lcom/ccit/mmwlan/util/Base64Encoder;->encodingTable:[B
a=0;// 
a=0;//     #v12=(Reference,[B);
a=0;//     shl-int/lit8 v13, v2, 0x2
a=0;// 
a=0;//     ushr-int/lit8 v14, v3, 0x6
a=0;// 
a=0;//     or-int/2addr v13, v14
a=0;// 
a=0;//     and-int/lit8 v13, v13, 0x3f
a=0;// 
a=0;//     aget-byte v12, v12, v13
a=0;// 
a=0;//     #v12=(Byte);
a=0;//     move-object/from16 v0, p4
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 70
a=0;//     iget-object v12, p0, Lcom/ccit/mmwlan/util/Base64Encoder;->encodingTable:[B
a=0;// 
a=0;//     #v12=(Reference,[B);
a=0;//     and-int/lit8 v13, v3, 0x3f
a=0;// 
a=0;//     aget-byte v12, v12, v13
a=0;// 
a=0;//     #v12=(Byte);
a=0;//     move-object/from16 v0, p4
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 61
a=0;//     add-int/lit8 v10, v10, 0x3
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 84
a=0;//     .end local v1    # "a1":I
a=0;//     .end local v2    # "a2":I
a=0;//     .end local v3    # "a3":I
a=0;//     :pswitch_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v12=(Integer);v13=(Conflicted);v14=(Conflicted);
a=0;//     add-int v12, p2, v9
a=0;// 
a=0;//     aget-byte v12, p1, v12
a=0;// 
a=0;//     #v12=(Byte);
a=0;//     and-int/lit16 v7, v12, 0xff
a=0;// 
a=0;//     .line 85
a=0;//     .local v7, "d1":I
a=0;//     #v7=(Integer);
a=0;//     ushr-int/lit8 v12, v7, 0x2
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     and-int/lit8 v4, v12, 0x3f
a=0;// 
a=0;//     .line 86
a=0;//     .local v4, "b1":I
a=0;//     #v4=(Integer);
a=0;//     shl-int/lit8 v12, v7, 0x4
a=0;// 
a=0;//     and-int/lit8 v5, v12, 0x3f
a=0;// 
a=0;//     .line 88
a=0;//     .local v5, "b2":I
a=0;//     #v5=(Integer);
a=0;//     iget-object v12, p0, Lcom/ccit/mmwlan/util/Base64Encoder;->encodingTable:[B
a=0;// 
a=0;//     #v12=(Reference,[B);
a=0;//     aget-byte v12, v12, v4
a=0;// 
a=0;//     #v12=(Byte);
a=0;//     move-object/from16 v0, p4
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/OutputStream;);
a=0;//     invoke-virtual {v0, v12}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 89
a=0;//     iget-object v12, p0, Lcom/ccit/mmwlan/util/Base64Encoder;->encodingTable:[B
a=0;// 
a=0;//     #v12=(Reference,[B);
a=0;//     aget-byte v12, v12, v5
a=0;// 
a=0;//     #v12=(Byte);
a=0;//     move-object/from16 v0, p4
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 90
a=0;//     iget-byte v12, p0, Lcom/ccit/mmwlan/util/Base64Encoder;->padding:B
a=0;// 
a=0;//     move-object/from16 v0, p4
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 91
a=0;//     iget-byte v12, p0, Lcom/ccit/mmwlan/util/Base64Encoder;->padding:B
a=0;// 
a=0;//     move-object/from16 v0, p4
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 94
a=0;//     .end local v4    # "b1":I
a=0;//     .end local v5    # "b2":I
a=0;//     .end local v7    # "d1":I
a=0;//     :pswitch_2
a=0;//     #v0=(Conflicted);v4=(Uninit);v5=(Uninit);v7=(Uninit);v12=(Integer);
a=0;//     add-int v12, p2, v9
a=0;// 
a=0;//     aget-byte v12, p1, v12
a=0;// 
a=0;//     #v12=(Byte);
a=0;//     and-int/lit16 v7, v12, 0xff
a=0;// 
a=0;//     .line 95
a=0;//     .restart local v7    # "d1":I
a=0;//     #v7=(Integer);
a=0;//     add-int v12, p2, v9
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     add-int/lit8 v12, v12, 0x1
a=0;// 
a=0;//     aget-byte v12, p1, v12
a=0;// 
a=0;//     #v12=(Byte);
a=0;//     and-int/lit16 v8, v12, 0xff
a=0;// 
a=0;//     .line 97
a=0;//     .local v8, "d2":I
a=0;//     #v8=(Integer);
a=0;//     ushr-int/lit8 v12, v7, 0x2
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     and-int/lit8 v4, v12, 0x3f
a=0;// 
a=0;//     .line 98
a=0;//     .restart local v4    # "b1":I
a=0;//     #v4=(Integer);
a=0;//     shl-int/lit8 v12, v7, 0x4
a=0;// 
a=0;//     ushr-int/lit8 v13, v8, 0x4
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     or-int/2addr v12, v13
a=0;// 
a=0;//     and-int/lit8 v5, v12, 0x3f
a=0;// 
a=0;//     .line 99
a=0;//     .restart local v5    # "b2":I
a=0;//     #v5=(Integer);
a=0;//     shl-int/lit8 v12, v8, 0x2
a=0;// 
a=0;//     and-int/lit8 v6, v12, 0x3f
a=0;// 
a=0;//     .line 101
a=0;//     .local v6, "b3":I
a=0;//     #v6=(Integer);
a=0;//     iget-object v12, p0, Lcom/ccit/mmwlan/util/Base64Encoder;->encodingTable:[B
a=0;// 
a=0;//     #v12=(Reference,[B);
a=0;//     aget-byte v12, v12, v4
a=0;// 
a=0;//     #v12=(Byte);
a=0;//     move-object/from16 v0, p4
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/OutputStream;);
a=0;//     invoke-virtual {v0, v12}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 102
a=0;//     iget-object v12, p0, Lcom/ccit/mmwlan/util/Base64Encoder;->encodingTable:[B
a=0;// 
a=0;//     #v12=(Reference,[B);
a=0;//     aget-byte v12, v12, v5
a=0;// 
a=0;//     #v12=(Byte);
a=0;//     move-object/from16 v0, p4
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 103
a=0;//     iget-object v12, p0, Lcom/ccit/mmwlan/util/Base64Encoder;->encodingTable:[B
a=0;// 
a=0;//     #v12=(Reference,[B);
a=0;//     aget-byte v12, v12, v6
a=0;// 
a=0;//     #v12=(Byte);
a=0;//     move-object/from16 v0, p4
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     .line 104
a=0;//     iget-byte v12, p0, Lcom/ccit/mmwlan/util/Base64Encoder;->padding:B
a=0;// 
a=0;//     move-object/from16 v0, p4
a=0;// 
a=0;//     invoke-virtual {v0, v12}, Ljava/io/OutputStream;->write(I)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 108
a=0;//     .end local v4    # "b1":I
a=0;//     .end local v5    # "b2":I
a=0;//     .end local v6    # "b3":I
a=0;//     .end local v7    # "d1":I
a=0;//     .end local v8    # "d2":I
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v12=(Integer);
a=0;//     const/4 v12, 0x4
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 79
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);v13=(Unknown);v14=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);p4=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method protected initialiseDecodingTable()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/util/Base64Encoder;->encodingTable:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 38
a=0;//     return-void
a=0;// 
a=0;//     .line 36
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/util/Base64Encoder;->decodingTable:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     iget-object v2, p0, Lcom/ccit/mmwlan/util/Base64Encoder;->encodingTable:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     aget-byte v2, v2, v0
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     int-to-byte v3, v0
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     aput-byte v3, v1, v2
a=0;// 
a=0;//     .line 34
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
