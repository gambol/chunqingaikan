package com.twocloo.base.alipay; class Base64 { void a() { int a;
a=0;// .class public final Lcom/twocloo/base/alipay/Base64;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Base64.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final BASELENGTH:I = 0x80
a=0;// 
a=0;// .field private static final EIGHTBIT:I = 0x8
a=0;// 
a=0;// .field private static final FOURBYTE:I = 0x4
a=0;// 
a=0;// .field private static final LOOKUPLENGTH:I = 0x40
a=0;// 
a=0;// .field private static final PAD:C = '='
a=0;// 
a=0;// .field private static final SIGN:I = -0x80
a=0;// 
a=0;// .field private static final SIXTEENBIT:I = 0x10
a=0;// 
a=0;// .field private static final TWENTYFOURBITGROUP:I = 0x18
a=0;// 
a=0;// .field private static final base64Alphabet:[B
a=0;// 
a=0;// .field private static final fDebug:Z
a=0;// 
a=0;// .field private static final lookUpBase64Alphabet:[C
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v8, 0x80
a=0;// 
a=0;//     #v8=(PosShort);
a=0;//     const/16 v7, 0x3f
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/16 v6, 0x3e
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/16 v5, 0x2f
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     const/16 v4, 0x2b
a=0;// 
a=0;//     .line 24
a=0;//     #v4=(PosByte);
a=0;//     new-array v2, v8, [B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     sput-object v2, Lcom/twocloo/base/alipay/Base64;->base64Alphabet:[B
a=0;// 
a=0;//     .line 25
a=0;//     const/16 v2, 0x40
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [C
a=0;// 
a=0;//     #v2=(Reference,[C);
a=0;//     sput-object v2, Lcom/twocloo/base/alipay/Base64;->lookUpBase64Alphabet:[C
a=0;// 
a=0;//     .line 28
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Conflicted);
a=0;//     if-lt v0, v8, :cond_0
a=0;// 
a=0;//     .line 31
a=0;//     const/16 v0, 0x5a
a=0;// 
a=0;//     :goto_1
a=0;//     const/16 v2, 0x41
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ge v0, v2, :cond_1
a=0;// 
a=0;//     .line 34
a=0;//     const/16 v0, 0x7a
a=0;// 
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);
a=0;//     const/16 v2, 0x61
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ge v0, v2, :cond_2
a=0;// 
a=0;//     .line 38
a=0;//     const/16 v0, 0x39
a=0;// 
a=0;//     :goto_3
a=0;//     #v2=(Conflicted);
a=0;//     const/16 v2, 0x30
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ge v0, v2, :cond_3
a=0;// 
a=0;//     .line 42
a=0;//     sget-object v2, Lcom/twocloo/base/alipay/Base64;->base64Alphabet:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     aput-byte v6, v2, v4
a=0;// 
a=0;//     .line 43
a=0;//     sget-object v2, Lcom/twocloo/base/alipay/Base64;->base64Alphabet:[B
a=0;// 
a=0;//     aput-byte v7, v2, v5
a=0;// 
a=0;//     .line 45
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_4
a=0;//     const/16 v2, 0x19
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-le v0, v2, :cond_4
a=0;// 
a=0;//     .line 49
a=0;//     const/16 v0, 0x1a
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "j":I
a=0;//     :goto_5
a=0;//     #v0=(Integer);v1=(Integer);v2=(Conflicted);
a=0;//     const/16 v2, 0x33
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-le v0, v2, :cond_5
a=0;// 
a=0;//     .line 53
a=0;//     const/16 v0, 0x34
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :goto_6
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     const/16 v2, 0x3d
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-le v0, v2, :cond_6
a=0;// 
a=0;//     .line 56
a=0;//     sget-object v2, Lcom/twocloo/base/alipay/Base64;->lookUpBase64Alphabet:[C
a=0;// 
a=0;//     #v2=(Reference,[C);
a=0;//     aput-char v4, v2, v6
a=0;// 
a=0;//     .line 57
a=0;//     sget-object v2, Lcom/twocloo/base/alipay/Base64;->lookUpBase64Alphabet:[C
a=0;// 
a=0;//     aput-char v5, v2, v7
a=0;// 
a=0;//     .line 59
a=0;//     return-void
a=0;// 
a=0;//     .line 29
a=0;//     .end local v1    # "j":I
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     sget-object v2, Lcom/twocloo/base/alipay/Base64;->base64Alphabet:[B
a=0;// 
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     aput-byte v3, v2, v0
a=0;// 
a=0;//     .line 28
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 32
a=0;//     :cond_1
a=0;//     #v2=(PosByte);v3=(Conflicted);
a=0;//     sget-object v2, Lcom/twocloo/base/alipay/Base64;->base64Alphabet:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     add-int/lit8 v3, v0, -0x41
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-byte v3, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     aput-byte v3, v2, v0
a=0;// 
a=0;//     .line 31
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 35
a=0;//     :cond_2
a=0;//     #v2=(PosByte);v3=(Conflicted);
a=0;//     sget-object v2, Lcom/twocloo/base/alipay/Base64;->base64Alphabet:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     add-int/lit8 v3, v0, -0x61
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, 0x1a
a=0;// 
a=0;//     int-to-byte v3, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     aput-byte v3, v2, v0
a=0;// 
a=0;//     .line 34
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 39
a=0;//     :cond_3
a=0;//     #v2=(PosByte);v3=(Conflicted);
a=0;//     sget-object v2, Lcom/twocloo/base/alipay/Base64;->base64Alphabet:[B
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     add-int/lit8 v3, v0, -0x30
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, 0x34
a=0;// 
a=0;//     int-to-byte v3, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     aput-byte v3, v2, v0
a=0;// 
a=0;//     .line 38
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 46
a=0;//     :cond_4
a=0;//     #v2=(PosByte);v3=(Conflicted);
a=0;//     sget-object v2, Lcom/twocloo/base/alipay/Base64;->lookUpBase64Alphabet:[C
a=0;// 
a=0;//     #v2=(Reference,[C);
a=0;//     add-int/lit8 v3, v0, 0x41
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-char v3, v3
a=0;// 
a=0;//     #v3=(Char);
a=0;//     aput-char v3, v2, v0
a=0;// 
a=0;//     .line 45
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 50
a=0;//     .restart local v1    # "j":I
a=0;//     :cond_5
a=0;//     #v1=(Integer);v2=(PosByte);v3=(Conflicted);
a=0;//     sget-object v2, Lcom/twocloo/base/alipay/Base64;->lookUpBase64Alphabet:[C
a=0;// 
a=0;//     #v2=(Reference,[C);
a=0;//     add-int/lit8 v3, v1, 0x61
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-char v3, v3
a=0;// 
a=0;//     #v3=(Char);
a=0;//     aput-char v3, v2, v0
a=0;// 
a=0;//     .line 49
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 54
a=0;//     :cond_6
a=0;//     #v2=(PosByte);v3=(Conflicted);
a=0;//     sget-object v2, Lcom/twocloo/base/alipay/Base64;->lookUpBase64Alphabet:[C
a=0;// 
a=0;//     #v2=(Reference,[C);
a=0;//     add-int/lit8 v3, v1, 0x30
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-char v3, v3
a=0;// 
a=0;//     #v3=(Char);
a=0;//     aput-char v3, v2, v0
a=0;// 
a=0;//     .line 53
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_6
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 13
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/alipay/Base64;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static decode(Ljava/lang/String;)[B
a=0;//     .locals 25
a=0;//     .param p0, "encoded"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 181
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 182
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     .line 270
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Reference,[B);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);
a=0;//     return-object v21
a=0;// 
a=0;//     .line 185
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Uninit);v24=(Uninit);
a=0;//     invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->toCharArray()[C
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 187
a=0;//     .local v8, "base64Data":[C
a=0;//     #v8=(Reference,[C);
a=0;//     invoke-static {v8}, Lcom/twocloo/base/alipay/Base64;->removeWhiteSpace([C)I
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     .line 189
a=0;//     .local v19, "len":I
a=0;//     #v19=(Integer);
a=0;//     rem-int/lit8 v22, v19, 0x4
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     if-eqz v22, :cond_1
a=0;// 
a=0;//     .line 190
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 193
a=0;//     :cond_1
a=0;//     #v21=(Uninit);
a=0;//     div-int/lit8 v20, v19, 0x4
a=0;// 
a=0;//     .line 195
a=0;//     .local v20, "numberQuadruple":I
a=0;//     #v20=(Integer);
a=0;//     if-nez v20, :cond_2
a=0;// 
a=0;//     .line 196
a=0;//     const/16 v22, 0x0
a=0;// 
a=0;//     #v22=(Null);
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(Null);
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     move-object/from16 v21, v0
a=0;// 
a=0;//     #v21=(Reference,[B);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 199
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v21=(Uninit);v22=(Integer);
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     .line 200
a=0;//     .local v15, "decodedData":[B
a=0;//     #v15=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .local v4, "b1":B
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .local v5, "b2":B
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .local v6, "b3":B
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 201
a=0;//     .local v7, "b4":B
a=0;//     #v7=(Null);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .local v9, "d1":C
a=0;//     #v9=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .local v10, "d2":C
a=0;//     #v10=(Null);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .local v11, "d3":C
a=0;//     #v11=(Null);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     .line 203
a=0;//     .local v12, "d4":C
a=0;//     #v12=(Null);
a=0;//     const/16 v18, 0x0
a=0;// 
a=0;//     .line 204
a=0;//     .local v18, "i":I
a=0;//     #v18=(Null);
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     .line 205
a=0;//     .local v16, "encodedIndex":I
a=0;//     #v16=(Null);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     .line 206
a=0;//     .local v13, "dataIndex":I
a=0;//     #v13=(Null);
a=0;//     mul-int/lit8 v22, v20, 0x3
a=0;// 
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v15, v0, [B
a=0;// 
a=0;//     #v15=(Reference,[B);
a=0;//     move v14, v13
a=0;// 
a=0;//     .end local v13    # "dataIndex":I
a=0;//     .local v14, "dataIndex":I
a=0;//     #v14=(Null);
a=0;//     move/from16 v17, v16
a=0;// 
a=0;//     .line 208
a=0;//     .end local v16    # "encodedIndex":I
a=0;//     .local v17, "encodedIndex":I
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v4=(Byte);v5=(Byte);v6=(Byte);v7=(Byte);v9=(Char);v10=(Char);v11=(Char);v12=(Char);v13=(Integer);v14=(Integer);v16=(Integer);v17=(Integer);v18=(Integer);v23=(Conflicted);
a=0;//     add-int/lit8 v22, v20, -0x1
a=0;// 
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_4
a=0;// 
a=0;//     .line 227
a=0;//     add-int/lit8 v13, v14, 0x1
a=0;// 
a=0;//     .end local v14    # "dataIndex":I
a=0;//     .restart local v13    # "dataIndex":I
a=0;//     aget-char v9, v8, v14
a=0;// 
a=0;//     invoke-static {v9}, Lcom/twocloo/base/alipay/Base64;->isData(C)Z
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     #v22=(Boolean);
a=0;//     if-eqz v22, :cond_3
a=0;// 
a=0;//     .line 228
a=0;//     add-int/lit8 v14, v13, 0x1
a=0;// 
a=0;//     .end local v13    # "dataIndex":I
a=0;//     .restart local v14    # "dataIndex":I
a=0;//     aget-char v10, v8, v13
a=0;// 
a=0;//     invoke-static {v10}, Lcom/twocloo/base/alipay/Base64;->isData(C)Z
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     if-nez v22, :cond_8
a=0;// 
a=0;//     move v13, v14
a=0;// 
a=0;//     .line 229
a=0;//     .end local v14    # "dataIndex":I
a=0;//     .restart local v13    # "dataIndex":I
a=0;//     :cond_3
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 210
a=0;//     .end local v13    # "dataIndex":I
a=0;//     .restart local v14    # "dataIndex":I
a=0;//     :cond_4
a=0;//     #v21=(Uninit);v22=(Integer);
a=0;//     add-int/lit8 v13, v14, 0x1
a=0;// 
a=0;//     .end local v14    # "dataIndex":I
a=0;//     .restart local v13    # "dataIndex":I
a=0;//     aget-char v9, v8, v14
a=0;// 
a=0;//     invoke-static {v9}, Lcom/twocloo/base/alipay/Base64;->isData(C)Z
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     #v22=(Boolean);
a=0;//     if-eqz v22, :cond_6
a=0;// 
a=0;//     .line 211
a=0;//     add-int/lit8 v14, v13, 0x1
a=0;// 
a=0;//     .end local v13    # "dataIndex":I
a=0;//     .restart local v14    # "dataIndex":I
a=0;//     aget-char v10, v8, v13
a=0;// 
a=0;//     invoke-static {v10}, Lcom/twocloo/base/alipay/Base64;->isData(C)Z
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     if-eqz v22, :cond_5
a=0;// 
a=0;//     .line 212
a=0;//     add-int/lit8 v13, v14, 0x1
a=0;// 
a=0;//     .end local v14    # "dataIndex":I
a=0;//     .restart local v13    # "dataIndex":I
a=0;//     aget-char v11, v8, v14
a=0;// 
a=0;//     invoke-static {v11}, Lcom/twocloo/base/alipay/Base64;->isData(C)Z
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     if-eqz v22, :cond_6
a=0;// 
a=0;//     .line 213
a=0;//     add-int/lit8 v14, v13, 0x1
a=0;// 
a=0;//     .end local v13    # "dataIndex":I
a=0;//     .restart local v14    # "dataIndex":I
a=0;//     aget-char v12, v8, v13
a=0;// 
a=0;//     invoke-static {v12}, Lcom/twocloo/base/alipay/Base64;->isData(C)Z
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     if-nez v22, :cond_7
a=0;// 
a=0;//     :cond_5
a=0;//     move v13, v14
a=0;// 
a=0;//     .line 214
a=0;//     .end local v14    # "dataIndex":I
a=0;//     .restart local v13    # "dataIndex":I
a=0;//     :cond_6
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 217
a=0;//     .end local v13    # "dataIndex":I
a=0;//     .restart local v14    # "dataIndex":I
a=0;//     :cond_7
a=0;//     #v21=(Uninit);
a=0;//     sget-object v22, Lcom/twocloo/base/alipay/Base64;->base64Alphabet:[B
a=0;// 
a=0;//     #v22=(Reference,[B);
a=0;//     aget-byte v4, v22, v9
a=0;// 
a=0;//     .line 218
a=0;//     sget-object v22, Lcom/twocloo/base/alipay/Base64;->base64Alphabet:[B
a=0;// 
a=0;//     aget-byte v5, v22, v10
a=0;// 
a=0;//     .line 219
a=0;//     sget-object v22, Lcom/twocloo/base/alipay/Base64;->base64Alphabet:[B
a=0;// 
a=0;//     aget-byte v6, v22, v11
a=0;// 
a=0;//     .line 220
a=0;//     sget-object v22, Lcom/twocloo/base/alipay/Base64;->base64Alphabet:[B
a=0;// 
a=0;//     aget-byte v7, v22, v12
a=0;// 
a=0;//     .line 222
a=0;//     add-int/lit8 v16, v17, 0x1
a=0;// 
a=0;//     .end local v17    # "encodedIndex":I
a=0;//     .restart local v16    # "encodedIndex":I
a=0;//     shl-int/lit8 v22, v4, 0x2
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     shr-int/lit8 v23, v5, 0x4
a=0;// 
a=0;//     #v23=(Byte);
a=0;//     or-int v22, v22, v23
a=0;// 
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     #v22=(Byte);
a=0;//     aput-byte v22, v15, v17
a=0;// 
a=0;//     .line 223
a=0;//     add-int/lit8 v17, v16, 0x1
a=0;// 
a=0;//     .end local v16    # "encodedIndex":I
a=0;//     .restart local v17    # "encodedIndex":I
a=0;//     and-int/lit8 v22, v5, 0xf
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     shl-int/lit8 v22, v22, 0x4
a=0;// 
a=0;//     shr-int/lit8 v23, v6, 0x2
a=0;// 
a=0;//     and-int/lit8 v23, v23, 0xf
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     or-int v22, v22, v23
a=0;// 
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     #v22=(Byte);
a=0;//     aput-byte v22, v15, v16
a=0;// 
a=0;//     .line 224
a=0;//     add-int/lit8 v16, v17, 0x1
a=0;// 
a=0;//     .end local v17    # "encodedIndex":I
a=0;//     .restart local v16    # "encodedIndex":I
a=0;//     shl-int/lit8 v22, v6, 0x6
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     or-int v22, v22, v7
a=0;// 
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     #v22=(Byte);
a=0;//     aput-byte v22, v15, v17
a=0;// 
a=0;//     .line 208
a=0;//     add-int/lit8 v18, v18, 0x1
a=0;// 
a=0;//     move/from16 v17, v16
a=0;// 
a=0;//     .end local v16    # "encodedIndex":I
a=0;//     .restart local v17    # "encodedIndex":I
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 232
a=0;//     :cond_8
a=0;//     #v0=(Integer);v22=(Boolean);v23=(Conflicted);
a=0;//     sget-object v22, Lcom/twocloo/base/alipay/Base64;->base64Alphabet:[B
a=0;// 
a=0;//     #v22=(Reference,[B);
a=0;//     aget-byte v4, v22, v9
a=0;// 
a=0;//     .line 233
a=0;//     sget-object v22, Lcom/twocloo/base/alipay/Base64;->base64Alphabet:[B
a=0;// 
a=0;//     aget-byte v5, v22, v10
a=0;// 
a=0;//     .line 235
a=0;//     add-int/lit8 v13, v14, 0x1
a=0;// 
a=0;//     .end local v14    # "dataIndex":I
a=0;//     .restart local v13    # "dataIndex":I
a=0;//     aget-char v11, v8, v14
a=0;// 
a=0;//     .line 236
a=0;//     add-int/lit8 v14, v13, 0x1
a=0;// 
a=0;//     .end local v13    # "dataIndex":I
a=0;//     .restart local v14    # "dataIndex":I
a=0;//     aget-char v12, v8, v13
a=0;// 
a=0;//     .line 237
a=0;//     invoke-static {v11}, Lcom/twocloo/base/alipay/Base64;->isData(C)Z
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     #v22=(Boolean);
a=0;//     if-eqz v22, :cond_9
a=0;// 
a=0;//     invoke-static {v12}, Lcom/twocloo/base/alipay/Base64;->isData(C)Z
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     if-nez v22, :cond_e
a=0;// 
a=0;//     .line 238
a=0;//     :cond_9
a=0;//     invoke-static {v11}, Lcom/twocloo/base/alipay/Base64;->isPad(C)Z
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     if-eqz v22, :cond_b
a=0;// 
a=0;//     invoke-static {v12}, Lcom/twocloo/base/alipay/Base64;->isPad(C)Z
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     if-eqz v22, :cond_b
a=0;// 
a=0;//     .line 239
a=0;//     and-int/lit8 v22, v5, 0xf
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     if-eqz v22, :cond_a
a=0;// 
a=0;//     .line 241
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 243
a=0;//     :cond_a
a=0;//     #v21=(Uninit);
a=0;//     mul-int/lit8 v22, v18, 0x3
a=0;// 
a=0;//     add-int/lit8 v22, v22, 0x1
a=0;// 
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     move-object/from16 v21, v0
a=0;// 
a=0;//     .line 244
a=0;//     .local v21, "tmp":[B
a=0;//     #v21=(Reference,[B);
a=0;//     const/16 v22, 0x0
a=0;// 
a=0;//     #v22=(Null);
a=0;//     const/16 v23, 0x0
a=0;// 
a=0;//     #v23=(Null);
a=0;//     mul-int/lit8 v24, v18, 0x3
a=0;// 
a=0;//     #v24=(Integer);
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object/from16 v1, v21
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     move/from16 v2, v23
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move/from16 v3, v24
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v15, v0, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 245
a=0;//     shl-int/lit8 v22, v4, 0x2
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     shr-int/lit8 v23, v5, 0x4
a=0;// 
a=0;//     #v23=(Byte);
a=0;//     or-int v22, v22, v23
a=0;// 
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     #v22=(Byte);
a=0;//     aput-byte v22, v21, v17
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 247
a=0;//     .end local v21    # "tmp":[B
a=0;//     :cond_b
a=0;//     #v0=(Integer);v1=(Integer);v2=(Uninit);v3=(Uninit);v21=(Uninit);v22=(Boolean);v23=(Conflicted);v24=(Uninit);
a=0;//     invoke-static {v11}, Lcom/twocloo/base/alipay/Base64;->isPad(C)Z
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     if-nez v22, :cond_d
a=0;// 
a=0;//     invoke-static {v12}, Lcom/twocloo/base/alipay/Base64;->isPad(C)Z
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     if-eqz v22, :cond_d
a=0;// 
a=0;//     .line 248
a=0;//     sget-object v22, Lcom/twocloo/base/alipay/Base64;->base64Alphabet:[B
a=0;// 
a=0;//     #v22=(Reference,[B);
a=0;//     aget-byte v6, v22, v11
a=0;// 
a=0;//     .line 249
a=0;//     and-int/lit8 v22, v6, 0x3
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     if-eqz v22, :cond_c
a=0;// 
a=0;//     .line 251
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 253
a=0;//     :cond_c
a=0;//     #v21=(Uninit);
a=0;//     mul-int/lit8 v22, v18, 0x3
a=0;// 
a=0;//     add-int/lit8 v22, v22, 0x2
a=0;// 
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     new-array v0, v0, [B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     move-object/from16 v21, v0
a=0;// 
a=0;//     .line 254
a=0;//     .restart local v21    # "tmp":[B
a=0;//     #v21=(Reference,[B);
a=0;//     const/16 v22, 0x0
a=0;// 
a=0;//     #v22=(Null);
a=0;//     const/16 v23, 0x0
a=0;// 
a=0;//     #v23=(Null);
a=0;//     mul-int/lit8 v24, v18, 0x3
a=0;// 
a=0;//     #v24=(Integer);
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object/from16 v1, v21
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     move/from16 v2, v23
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move/from16 v3, v24
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v15, v0, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 255
a=0;//     add-int/lit8 v16, v17, 0x1
a=0;// 
a=0;//     .end local v17    # "encodedIndex":I
a=0;//     .restart local v16    # "encodedIndex":I
a=0;//     shl-int/lit8 v22, v4, 0x2
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     shr-int/lit8 v23, v5, 0x4
a=0;// 
a=0;//     #v23=(Byte);
a=0;//     or-int v22, v22, v23
a=0;// 
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     #v22=(Byte);
a=0;//     aput-byte v22, v21, v17
a=0;// 
a=0;//     .line 256
a=0;//     and-int/lit8 v22, v5, 0xf
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     shl-int/lit8 v22, v22, 0x4
a=0;// 
a=0;//     shr-int/lit8 v23, v6, 0x2
a=0;// 
a=0;//     and-int/lit8 v23, v23, 0xf
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     or-int v22, v22, v23
a=0;// 
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     #v22=(Byte);
a=0;//     aput-byte v22, v21, v16
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 259
a=0;//     .end local v16    # "encodedIndex":I
a=0;//     .end local v21    # "tmp":[B
a=0;//     .restart local v17    # "encodedIndex":I
a=0;//     :cond_d
a=0;//     #v0=(Integer);v1=(Integer);v2=(Uninit);v3=(Uninit);v21=(Uninit);v22=(Boolean);v23=(Conflicted);v24=(Uninit);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 262
a=0;//     :cond_e
a=0;//     #v21=(Uninit);
a=0;//     sget-object v22, Lcom/twocloo/base/alipay/Base64;->base64Alphabet:[B
a=0;// 
a=0;//     #v22=(Reference,[B);
a=0;//     aget-byte v6, v22, v11
a=0;// 
a=0;//     .line 263
a=0;//     sget-object v22, Lcom/twocloo/base/alipay/Base64;->base64Alphabet:[B
a=0;// 
a=0;//     aget-byte v7, v22, v12
a=0;// 
a=0;//     .line 264
a=0;//     add-int/lit8 v16, v17, 0x1
a=0;// 
a=0;//     .end local v17    # "encodedIndex":I
a=0;//     .restart local v16    # "encodedIndex":I
a=0;//     shl-int/lit8 v22, v4, 0x2
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     shr-int/lit8 v23, v5, 0x4
a=0;// 
a=0;//     #v23=(Byte);
a=0;//     or-int v22, v22, v23
a=0;// 
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     #v22=(Byte);
a=0;//     aput-byte v22, v15, v17
a=0;// 
a=0;//     .line 265
a=0;//     add-int/lit8 v17, v16, 0x1
a=0;// 
a=0;//     .end local v16    # "encodedIndex":I
a=0;//     .restart local v17    # "encodedIndex":I
a=0;//     and-int/lit8 v22, v5, 0xf
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     shl-int/lit8 v22, v22, 0x4
a=0;// 
a=0;//     shr-int/lit8 v23, v6, 0x2
a=0;// 
a=0;//     and-int/lit8 v23, v23, 0xf
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     or-int v22, v22, v23
a=0;// 
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     #v22=(Byte);
a=0;//     aput-byte v22, v15, v16
a=0;// 
a=0;//     .line 266
a=0;//     add-int/lit8 v16, v17, 0x1
a=0;// 
a=0;//     .end local v17    # "encodedIndex":I
a=0;//     .restart local v16    # "encodedIndex":I
a=0;//     shl-int/lit8 v22, v6, 0x6
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     or-int v22, v22, v7
a=0;// 
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     #v22=(Byte);
a=0;//     aput-byte v22, v15, v17
a=0;// 
a=0;//     move-object/from16 v21, v15
a=0;// 
a=0;//     .line 270
a=0;//     #v21=(Reference,[B);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static encode([B)Ljava/lang/String;
a=0;//     .locals 21
a=0;//     .param p0, "binaryData"    # [B
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 83
a=0;//     const/16 v19, 0x0
a=0;// 
a=0;//     .line 169
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Reference,Ljava/lang/String;);v20=(Conflicted);
a=0;//     return-object v19
a=0;// 
a=0;//     .line 86
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     mul-int/lit8 v13, v19, 0x8
a=0;// 
a=0;//     .line 87
a=0;//     .local v13, "lengthDataBits":I
a=0;//     #v13=(Integer);
a=0;//     if-nez v13, :cond_1
a=0;// 
a=0;//     .line 88
a=0;//     const-string v19, ""
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 91
a=0;//     :cond_1
a=0;//     #v19=(Integer);
a=0;//     rem-int/lit8 v9, v13, 0x18
a=0;// 
a=0;//     .line 92
a=0;//     .local v9, "fewerThan24bits":I
a=0;//     #v9=(Integer);
a=0;//     div-int/lit8 v15, v13, 0x18
a=0;// 
a=0;//     .line 93
a=0;//     .local v15, "numberTriplets":I
a=0;//     #v15=(Integer);
a=0;//     if-eqz v9, :cond_2
a=0;// 
a=0;//     add-int/lit8 v14, v15, 0x1
a=0;// 
a=0;//     .line 95
a=0;//     .local v14, "numberQuartet":I
a=0;//     :goto_1
a=0;//     #v14=(Integer);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 97
a=0;//     .local v6, "encodedData":[C
a=0;//     #v6=(Null);
a=0;//     mul-int/lit8 v19, v14, 0x4
a=0;// 
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     new-array v6, v0, [C
a=0;// 
a=0;//     .line 99
a=0;//     #v6=(Reference,[C);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .local v11, "k":B
a=0;//     #v11=(Null);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     .local v12, "l":B
a=0;//     #v12=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "b1":B
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "b2":B
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 101
a=0;//     .local v3, "b3":B
a=0;//     #v3=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 102
a=0;//     .local v7, "encodedIndex":I
a=0;//     #v7=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 107
a=0;//     .local v4, "dataIndex":I
a=0;//     #v4=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .local v10, "i":I
a=0;//     #v10=(Null);
a=0;//     move v5, v4
a=0;// 
a=0;//     .end local v4    # "dataIndex":I
a=0;//     .local v5, "dataIndex":I
a=0;//     #v5=(Null);
a=0;//     move v8, v7
a=0;// 
a=0;//     .end local v7    # "encodedIndex":I
a=0;//     .local v8, "encodedIndex":I
a=0;//     :goto_2
a=0;//     #v1=(Byte);v2=(Byte);v3=(Byte);v4=(Integer);v5=(Integer);v7=(Integer);v8=(Integer);v10=(Integer);v11=(Byte);v12=(Byte);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v20=(Conflicted);
a=0;//     if-lt v10, v15, :cond_3
a=0;// 
a=0;//     .line 139
a=0;//     const/16 v19, 0x8
a=0;// 
a=0;//     #v19=(PosByte);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne v9, v0, :cond_8
a=0;// 
a=0;//     .line 140
a=0;//     aget-byte v1, p0, v5
a=0;// 
a=0;//     .line 141
a=0;//     and-int/lit8 v19, v1, 0x3
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-byte v11, v0
a=0;// 
a=0;//     .line 146
a=0;//     and-int/lit8 v19, v1, -0x80
a=0;// 
a=0;//     if-nez v19, :cond_7
a=0;// 
a=0;//     shr-int/lit8 v19, v1, 0x2
a=0;// 
a=0;//     #v19=(Byte);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     .line 148
a=0;//     .local v16, "val1":B
a=0;//     :goto_3
a=0;//     #v16=(Byte);v19=(Integer);
a=0;//     add-int/lit8 v7, v8, 0x1
a=0;// 
a=0;//     .end local v8    # "encodedIndex":I
a=0;//     .restart local v7    # "encodedIndex":I
a=0;//     sget-object v19, Lcom/twocloo/base/alipay/Base64;->lookUpBase64Alphabet:[C
a=0;// 
a=0;//     #v19=(Reference,[C);
a=0;//     aget-char v19, v19, v16
a=0;// 
a=0;//     #v19=(Char);
a=0;//     aput-char v19, v6, v8
a=0;// 
a=0;//     .line 149
a=0;//     add-int/lit8 v8, v7, 0x1
a=0;// 
a=0;//     .end local v7    # "encodedIndex":I
a=0;//     .restart local v8    # "encodedIndex":I
a=0;//     sget-object v19, Lcom/twocloo/base/alipay/Base64;->lookUpBase64Alphabet:[C
a=0;// 
a=0;//     #v19=(Reference,[C);
a=0;//     shl-int/lit8 v20, v11, 0x4
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     aget-char v19, v19, v20
a=0;// 
a=0;//     #v19=(Char);
a=0;//     aput-char v19, v6, v7
a=0;// 
a=0;//     .line 150
a=0;//     add-int/lit8 v7, v8, 0x1
a=0;// 
a=0;//     .end local v8    # "encodedIndex":I
a=0;//     .restart local v7    # "encodedIndex":I
a=0;//     const/16 v19, 0x3d
a=0;// 
a=0;//     #v19=(PosByte);
a=0;//     aput-char v19, v6, v8
a=0;// 
a=0;//     .line 151
a=0;//     add-int/lit8 v8, v7, 0x1
a=0;// 
a=0;//     .end local v7    # "encodedIndex":I
a=0;//     .restart local v8    # "encodedIndex":I
a=0;//     const/16 v19, 0x3d
a=0;// 
a=0;//     aput-char v19, v6, v7
a=0;// 
a=0;//     move v7, v8
a=0;// 
a=0;//     .line 169
a=0;//     .end local v8    # "encodedIndex":I
a=0;//     .end local v16    # "val1":B
a=0;//     .restart local v7    # "encodedIndex":I
a=0;//     :goto_4
a=0;//     #v16=(Conflicted);v20=(Conflicted);
a=0;//     new-instance v19, Ljava/lang/String;
a=0;// 
a=0;//     #v19=(UninitRef,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v6}, Ljava/lang/String;-><init>([C)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);v19=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .end local v1    # "b1":B
a=0;//     .end local v2    # "b2":B
a=0;//     .end local v3    # "b3":B
a=0;//     .end local v5    # "dataIndex":I
a=0;//     .end local v6    # "encodedData":[C
a=0;//     .end local v7    # "encodedIndex":I
a=0;//     .end local v10    # "i":I
a=0;//     .end local v11    # "k":B
a=0;//     .end local v12    # "l":B
a=0;//     .end local v14    # "numberQuartet":I
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v14=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Integer);v20=(Uninit);
a=0;//     move v14, v15
a=0;// 
a=0;//     .line 94
a=0;//     #v14=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 108
a=0;//     .restart local v1    # "b1":B
a=0;//     .restart local v2    # "b2":B
a=0;//     .restart local v3    # "b3":B
a=0;//     .restart local v5    # "dataIndex":I
a=0;//     .restart local v6    # "encodedData":[C
a=0;//     .restart local v8    # "encodedIndex":I
a=0;//     .restart local v10    # "i":I
a=0;//     .restart local v11    # "k":B
a=0;//     .restart local v12    # "l":B
a=0;//     .restart local v14    # "numberQuartet":I
a=0;//     :cond_3
a=0;//     #v1=(Byte);v2=(Byte);v3=(Byte);v4=(Integer);v5=(Integer);v6=(Reference,[C);v7=(Integer);v8=(Integer);v10=(Integer);v11=(Byte);v12=(Byte);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v20=(Conflicted);
a=0;//     add-int/lit8 v4, v5, 0x1
a=0;// 
a=0;//     .end local v5    # "dataIndex":I
a=0;//     .restart local v4    # "dataIndex":I
a=0;//     aget-byte v1, p0, v5
a=0;// 
a=0;//     .line 109
a=0;//     add-int/lit8 v5, v4, 0x1
a=0;// 
a=0;//     .end local v4    # "dataIndex":I
a=0;//     .restart local v5    # "dataIndex":I
a=0;//     aget-byte v2, p0, v4
a=0;// 
a=0;//     .line 110
a=0;//     add-int/lit8 v4, v5, 0x1
a=0;// 
a=0;//     .end local v5    # "dataIndex":I
a=0;//     .restart local v4    # "dataIndex":I
a=0;//     aget-byte v3, p0, v5
a=0;// 
a=0;//     .line 116
a=0;//     and-int/lit8 v19, v2, 0xf
a=0;// 
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     int-to-byte v12, v0
a=0;// 
a=0;//     .line 117
a=0;//     and-int/lit8 v19, v1, 0x3
a=0;// 
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     int-to-byte v11, v0
a=0;// 
a=0;//     .line 119
a=0;//     and-int/lit8 v19, v1, -0x80
a=0;// 
a=0;//     if-nez v19, :cond_4
a=0;// 
a=0;//     shr-int/lit8 v19, v1, 0x2
a=0;// 
a=0;//     #v19=(Byte);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     .line 121
a=0;//     .restart local v16    # "val1":B
a=0;//     :goto_5
a=0;//     #v16=(Byte);v19=(Integer);
a=0;//     and-int/lit8 v19, v2, -0x80
a=0;// 
a=0;//     if-nez v19, :cond_5
a=0;// 
a=0;//     shr-int/lit8 v19, v2, 0x4
a=0;// 
a=0;//     #v19=(Byte);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     .line 123
a=0;//     .local v17, "val2":B
a=0;//     :goto_6
a=0;//     #v17=(Byte);v19=(Integer);
a=0;//     and-int/lit8 v19, v3, -0x80
a=0;// 
a=0;//     if-nez v19, :cond_6
a=0;// 
a=0;//     shr-int/lit8 v19, v3, 0x6
a=0;// 
a=0;//     #v19=(Byte);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     .line 132
a=0;//     .local v18, "val3":B
a=0;//     :goto_7
a=0;//     #v18=(Byte);v19=(Integer);
a=0;//     add-int/lit8 v7, v8, 0x1
a=0;// 
a=0;//     .end local v8    # "encodedIndex":I
a=0;//     .restart local v7    # "encodedIndex":I
a=0;//     sget-object v19, Lcom/twocloo/base/alipay/Base64;->lookUpBase64Alphabet:[C
a=0;// 
a=0;//     #v19=(Reference,[C);
a=0;//     aget-char v19, v19, v16
a=0;// 
a=0;//     #v19=(Char);
a=0;//     aput-char v19, v6, v8
a=0;// 
a=0;//     .line 133
a=0;//     add-int/lit8 v8, v7, 0x1
a=0;// 
a=0;//     .end local v7    # "encodedIndex":I
a=0;//     .restart local v8    # "encodedIndex":I
a=0;//     sget-object v19, Lcom/twocloo/base/alipay/Base64;->lookUpBase64Alphabet:[C
a=0;// 
a=0;//     #v19=(Reference,[C);
a=0;//     shl-int/lit8 v20, v11, 0x4
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     or-int v20, v20, v17
a=0;// 
a=0;//     aget-char v19, v19, v20
a=0;// 
a=0;//     #v19=(Char);
a=0;//     aput-char v19, v6, v7
a=0;// 
a=0;//     .line 134
a=0;//     add-int/lit8 v7, v8, 0x1
a=0;// 
a=0;//     .end local v8    # "encodedIndex":I
a=0;//     .restart local v7    # "encodedIndex":I
a=0;//     sget-object v19, Lcom/twocloo/base/alipay/Base64;->lookUpBase64Alphabet:[C
a=0;// 
a=0;//     #v19=(Reference,[C);
a=0;//     shl-int/lit8 v20, v12, 0x2
a=0;// 
a=0;//     or-int v20, v20, v18
a=0;// 
a=0;//     aget-char v19, v19, v20
a=0;// 
a=0;//     #v19=(Char);
a=0;//     aput-char v19, v6, v8
a=0;// 
a=0;//     .line 135
a=0;//     add-int/lit8 v8, v7, 0x1
a=0;// 
a=0;//     .end local v7    # "encodedIndex":I
a=0;//     .restart local v8    # "encodedIndex":I
a=0;//     sget-object v19, Lcom/twocloo/base/alipay/Base64;->lookUpBase64Alphabet:[C
a=0;// 
a=0;//     #v19=(Reference,[C);
a=0;//     and-int/lit8 v20, v3, 0x3f
a=0;// 
a=0;//     aget-char v19, v19, v20
a=0;// 
a=0;//     #v19=(Char);
a=0;//     aput-char v19, v6, v7
a=0;// 
a=0;//     .line 107
a=0;//     add-int/lit8 v10, v10, 0x1
a=0;// 
a=0;//     move v5, v4
a=0;// 
a=0;//     .end local v4    # "dataIndex":I
a=0;//     .restart local v5    # "dataIndex":I
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 120
a=0;//     .end local v5    # "dataIndex":I
a=0;//     .end local v16    # "val1":B
a=0;//     .end local v17    # "val2":B
a=0;//     .end local v18    # "val3":B
a=0;//     .restart local v4    # "dataIndex":I
a=0;//     :cond_4
a=0;//     #v0=(Integer);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Integer);v20=(Conflicted);
a=0;//     shr-int/lit8 v19, v1, 0x2
a=0;// 
a=0;//     #v19=(Byte);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     xor-int/lit16 v0, v0, 0xc0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Byte);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 122
a=0;//     .restart local v16    # "val1":B
a=0;//     :cond_5
a=0;//     shr-int/lit8 v19, v2, 0x4
a=0;// 
a=0;//     #v19=(Byte);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     xor-int/lit16 v0, v0, 0xf0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Byte);
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 124
a=0;//     .restart local v17    # "val2":B
a=0;//     :cond_6
a=0;//     shr-int/lit8 v19, v3, 0x6
a=0;// 
a=0;//     #v19=(Byte);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     xor-int/lit16 v0, v0, 0xfc
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     #v18=(Byte);
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 147
a=0;//     .end local v4    # "dataIndex":I
a=0;//     .end local v16    # "val1":B
a=0;//     .end local v17    # "val2":B
a=0;//     .restart local v5    # "dataIndex":I
a=0;//     :cond_7
a=0;//     #v0=(Integer);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);
a=0;//     shr-int/lit8 v19, v1, 0x2
a=0;// 
a=0;//     #v19=(Byte);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     xor-int/lit16 v0, v0, 0xc0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Byte);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 152
a=0;//     :cond_8
a=0;//     #v0=(PosByte);v16=(Conflicted);v19=(PosByte);
a=0;//     const/16 v19, 0x10
a=0;// 
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     if-ne v9, v0, :cond_9
a=0;// 
a=0;//     .line 153
a=0;//     aget-byte v1, p0, v5
a=0;// 
a=0;//     .line 154
a=0;//     add-int/lit8 v19, v5, 0x1
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     aget-byte v2, p0, v19
a=0;// 
a=0;//     .line 155
a=0;//     and-int/lit8 v19, v2, 0xf
a=0;// 
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-byte v12, v0
a=0;// 
a=0;//     .line 156
a=0;//     and-int/lit8 v19, v1, 0x3
a=0;// 
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     int-to-byte v11, v0
a=0;// 
a=0;//     .line 158
a=0;//     and-int/lit8 v19, v1, -0x80
a=0;// 
a=0;//     if-nez v19, :cond_a
a=0;// 
a=0;//     shr-int/lit8 v19, v1, 0x2
a=0;// 
a=0;//     #v19=(Byte);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     .line 160
a=0;//     .restart local v16    # "val1":B
a=0;//     :goto_8
a=0;//     #v16=(Byte);v19=(Integer);
a=0;//     and-int/lit8 v19, v2, -0x80
a=0;// 
a=0;//     if-nez v19, :cond_b
a=0;// 
a=0;//     shr-int/lit8 v19, v2, 0x4
a=0;// 
a=0;//     #v19=(Byte);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     .line 163
a=0;//     .restart local v17    # "val2":B
a=0;//     :goto_9
a=0;//     #v17=(Byte);v19=(Integer);
a=0;//     add-int/lit8 v7, v8, 0x1
a=0;// 
a=0;//     .end local v8    # "encodedIndex":I
a=0;//     .restart local v7    # "encodedIndex":I
a=0;//     sget-object v19, Lcom/twocloo/base/alipay/Base64;->lookUpBase64Alphabet:[C
a=0;// 
a=0;//     #v19=(Reference,[C);
a=0;//     aget-char v19, v19, v16
a=0;// 
a=0;//     #v19=(Char);
a=0;//     aput-char v19, v6, v8
a=0;// 
a=0;//     .line 164
a=0;//     add-int/lit8 v8, v7, 0x1
a=0;// 
a=0;//     .end local v7    # "encodedIndex":I
a=0;//     .restart local v8    # "encodedIndex":I
a=0;//     sget-object v19, Lcom/twocloo/base/alipay/Base64;->lookUpBase64Alphabet:[C
a=0;// 
a=0;//     #v19=(Reference,[C);
a=0;//     shl-int/lit8 v20, v11, 0x4
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     or-int v20, v20, v17
a=0;// 
a=0;//     aget-char v19, v19, v20
a=0;// 
a=0;//     #v19=(Char);
a=0;//     aput-char v19, v6, v7
a=0;// 
a=0;//     .line 165
a=0;//     add-int/lit8 v7, v8, 0x1
a=0;// 
a=0;//     .end local v8    # "encodedIndex":I
a=0;//     .restart local v7    # "encodedIndex":I
a=0;//     sget-object v19, Lcom/twocloo/base/alipay/Base64;->lookUpBase64Alphabet:[C
a=0;// 
a=0;//     #v19=(Reference,[C);
a=0;//     shl-int/lit8 v20, v12, 0x2
a=0;// 
a=0;//     aget-char v19, v19, v20
a=0;// 
a=0;//     #v19=(Char);
a=0;//     aput-char v19, v6, v8
a=0;// 
a=0;//     .line 166
a=0;//     add-int/lit8 v8, v7, 0x1
a=0;// 
a=0;//     .end local v7    # "encodedIndex":I
a=0;//     .restart local v8    # "encodedIndex":I
a=0;//     const/16 v19, 0x3d
a=0;// 
a=0;//     #v19=(PosByte);
a=0;//     aput-char v19, v6, v7
a=0;// 
a=0;//     .end local v16    # "val1":B
a=0;//     .end local v17    # "val2":B
a=0;//     :cond_9
a=0;//     #v16=(Conflicted);v17=(Conflicted);v20=(Conflicted);
a=0;//     move v7, v8
a=0;// 
a=0;//     .end local v8    # "encodedIndex":I
a=0;//     .restart local v7    # "encodedIndex":I
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 159
a=0;//     .end local v7    # "encodedIndex":I
a=0;//     .restart local v8    # "encodedIndex":I
a=0;//     :cond_a
a=0;//     #v0=(Integer);v19=(Integer);
a=0;//     shr-int/lit8 v19, v1, 0x2
a=0;// 
a=0;//     #v19=(Byte);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     xor-int/lit16 v0, v0, 0xc0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Byte);
a=0;//     goto :goto_8
a=0;// 
a=0;//     .line 161
a=0;//     .restart local v16    # "val1":B
a=0;//     :cond_b
a=0;//     shr-int/lit8 v19, v2, 0x4
a=0;// 
a=0;//     #v19=(Byte);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     xor-int/lit16 v0, v0, 0xf0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     int-to-byte v0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Byte);
a=0;//     goto :goto_9
a=0;// .end method
a=0;// 
a=0;// .method private static isData(C)Z
a=0;//     .locals 2
a=0;//     .param p0, "octect"    # C
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     const/16 v0, 0x80
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     if-ge p0, v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcom/twocloo/base/alipay/Base64;->base64Alphabet:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     aget-byte v0, v0, p0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Short);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static isPad(C)Z
a=0;//     .locals 1
a=0;//     .param p0, "octect"    # C
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     const/16 v0, 0x3d
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p0, v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(PosByte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static isWhiteSpace(C)Z
a=0;//     .locals 1
a=0;//     .param p0, "octect"    # C
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     const/16 v0, 0x20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-eq p0, v0, :cond_0
a=0;// 
a=0;//     const/16 v0, 0xd
a=0;// 
a=0;//     if-eq p0, v0, :cond_0
a=0;// 
a=0;//     const/16 v0, 0xa
a=0;// 
a=0;//     if-eq p0, v0, :cond_0
a=0;// 
a=0;//     const/16 v0, 0x9
a=0;// 
a=0;//     if-eq p0, v0, :cond_0
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
a=0;// .method private static removeWhiteSpace([C)I
a=0;//     .locals 5
a=0;//     .param p0, "data"    # [C
a=0;// 
a=0;//     .prologue
a=0;//     .line 281
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 282
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 293
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Integer);v4=(Conflicted);
a=0;//     return v3
a=0;// 
a=0;//     .line 286
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 287
a=0;//     .local v2, "newSize":I
a=0;//     #v2=(Null);
a=0;//     array-length v1, p0
a=0;// 
a=0;//     .line 288
a=0;//     .local v1, "len":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     #v0=(Null);
a=0;//     move v3, v2
a=0;// 
a=0;//     .end local v2    # "newSize":I
a=0;//     .local v3, "newSize":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Integer);v3=(Integer);v4=(Conflicted);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 289
a=0;//     aget-char v4, p0, v0
a=0;// 
a=0;//     #v4=(Char);
a=0;//     invoke-static {v4}, Lcom/twocloo/base/alipay/Base64;->isWhiteSpace(C)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     .line 290
a=0;//     add-int/lit8 v2, v3, 0x1
a=0;// 
a=0;//     .end local v3    # "newSize":I
a=0;//     .restart local v2    # "newSize":I
a=0;//     aget-char v4, p0, v0
a=0;// 
a=0;//     #v4=(Char);
a=0;//     aput-char v4, p0, v3
a=0;// 
a=0;//     .line 288
a=0;//     :goto_1
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     move v3, v2
a=0;// 
a=0;//     .end local v2    # "newSize":I
a=0;//     .restart local v3    # "newSize":I
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v4=(Boolean);
a=0;//     move v2, v3
a=0;// 
a=0;//     .end local v3    # "newSize":I
a=0;//     .restart local v2    # "newSize":I
a=0;//     goto :goto_1
a=0;// .end method
}}
