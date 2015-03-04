package com.ccit.mmwlan.httpClient; class MoServerHttpPostResponse { void a() { int a;
a=0;// .class public Lcom/ccit/mmwlan/httpClient/MoServerHttpPostResponse;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MoServerHttpPostResponse.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static PROTOCALVERSION:I
a=0;// 
a=0;// .field public static RETUENCODE:I
a=0;// 
a=0;// .field public static TRANSACTIONID:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 23
a=0;//     const v0, -0x1020305
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sput v0, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostResponse;->PROTOCALVERSION:I
a=0;// 
a=0;//     .line 24
a=0;//     const/16 v0, 0x6f
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     sput v0, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostResponse;->TRANSACTIONID:I
a=0;// 
a=0;//     .line 25
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput v0, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostResponse;->RETUENCODE:I
a=0;// 
a=0;//     .line 20
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 20
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/ccit/mmwlan/httpClient/MoServerHttpPostResponse;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static byte2ToShort([BI)S
a=0;//     .locals 2
a=0;//     .param p0, "mybytes"    # [B
a=0;//     .param p1, "nOff"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 149
a=0;//     add-int/lit8 v0, p1, 0x0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     aget-byte v0, p0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     and-int/lit16 v0, v0, 0xff
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-short v0, v0
a=0;// 
a=0;//     #v0=(Short);
a=0;//     shl-int/lit8 v0, v0, 0x8
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v1, p1, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget-byte v1, p0, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     and-int/lit16 v1, v1, 0xff
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-short v1, v1
a=0;// 
a=0;//     #v1=(Short);
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     int-to-short v0, v0
a=0;// 
a=0;//     #v0=(Short);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static bytes4ToInt([BI)I
a=0;//     .locals 2
a=0;//     .param p0, "mybytes"    # [B
a=0;//     .param p1, "nOff"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 153
a=0;//     add-int/lit8 v0, p1, 0x0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     aget-byte v0, p0, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     and-int/lit16 v0, v0, 0xff
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     shl-int/lit8 v0, v0, 0x18
a=0;// 
a=0;//     .line 154
a=0;//     add-int/lit8 v1, p1, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget-byte v1, p0, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     and-int/lit16 v1, v1, 0xff
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     shl-int/lit8 v1, v1, 0x10
a=0;// 
a=0;//     .line 153
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     .line 155
a=0;//     add-int/lit8 v1, p1, 0x2
a=0;// 
a=0;//     aget-byte v1, p0, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     and-int/lit16 v1, v1, 0xff
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     shl-int/lit8 v1, v1, 0x8
a=0;// 
a=0;//     .line 153
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     .line 155
a=0;//     add-int/lit8 v1, p1, 0x3
a=0;// 
a=0;//     aget-byte v1, p0, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     and-int/lit16 v1, v1, 0xff
a=0;// 
a=0;//     .line 153
a=0;//     #v1=(Integer);
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public inflaterHttpPostResponse([B)Ljava/lang/String;
a=0;//     .locals 24
a=0;//     .param p1, "byResponse"    # [B
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     const/16 v18, 0x0
a=0;// 
a=0;//     .line 33
a=0;//     .local v18, "strMessageBody":Ljava/lang/String;
a=0;//     #v18=(Null);
a=0;//     const/4 v6, 0x4
a=0;// 
a=0;//     .line 35
a=0;//     .local v6, "intValue":I
a=0;//     #v6=(PosByte);
a=0;//     new-array v12, v6, [B
a=0;// 
a=0;//     .line 38
a=0;//     .local v12, "messageHead":[B
a=0;//     #v12=(Reference,[B);
a=0;//     new-instance v2, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-direct {v2, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     .line 41
a=0;//     .local v2, "bais":Ljava/io/ByteArrayInputStream;
a=0;//     #v2=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {v2, v0}, Ljava/io/ByteArrayInputStream;->mark(I)V
a=0;// 
a=0;//     .line 42
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayInputStream;->reset()V
a=0;// 
a=0;//     .line 45
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     array-length v0, v12
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v2, v12, v0, v1}, Ljava/io/ByteArrayInputStream;->read([BII)I
a=0;// 
a=0;//     .line 46
a=0;//     const/16 v21, 0x1
a=0;// 
a=0;//     #v21=(One);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {v2, v0}, Ljava/io/ByteArrayInputStream;->mark(I)V
a=0;// 
a=0;//     .line 47
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v12, v0}, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostResponse;->bytes4ToInt([BI)I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     .line 50
a=0;//     .local v15, "protocolVersion":I
a=0;//     #v15=(Integer);
a=0;//     sget v21, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostResponse;->PROTOCALVERSION:I
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v15, v0, :cond_0
a=0;// 
a=0;//     .line 52
a=0;//     new-instance v21, Ljava/lang/Exception;
a=0;// 
a=0;//     #v21=(UninitRef,Ljava/lang/Exception;);
a=0;//     new-instance v22, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v22=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v23, "Protocol Version error! protocolVersion="
a=0;// 
a=0;//     #v23=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v22 .. v23}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 53
a=0;//     #v22=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     .line 52
a=0;//     invoke-direct/range {v21 .. v22}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v21=(Reference,Ljava/lang/Exception;);
a=0;//     throw v21
a=0;// 
a=0;//     .line 57
a=0;//     :cond_0
a=0;//     #v0=(Integer);v21=(Integer);v22=(Integer);v23=(Uninit);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     array-length v0, v12
a=0;// 
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     invoke-virtual {v2, v12, v0, v1}, Ljava/io/ByteArrayInputStream;->read([BII)I
a=0;// 
a=0;//     .line 58
a=0;//     const/16 v21, 0x2
a=0;// 
a=0;//     #v21=(PosByte);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v2, v0}, Ljava/io/ByteArrayInputStream;->mark(I)V
a=0;// 
a=0;//     .line 59
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v12, v0}, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostResponse;->bytes4ToInt([BI)I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     .line 64
a=0;//     .local v13, "messageLength":I
a=0;//     #v13=(Integer);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     array-length v0, v12
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     invoke-virtual {v2, v12, v0, v1}, Ljava/io/ByteArrayInputStream;->read([BII)I
a=0;// 
a=0;//     .line 65
a=0;//     const/16 v21, 0x3
a=0;// 
a=0;//     #v21=(PosByte);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v2, v0}, Ljava/io/ByteArrayInputStream;->mark(I)V
a=0;// 
a=0;//     .line 66
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v12, v0}, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostResponse;->bytes4ToInt([BI)I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 67
a=0;//     .local v14, "messageType":I
a=0;//     #v14=(Integer);
a=0;//     const-string v21, "MmClientSdk"
a=0;// 
a=0;//     #v21=(Reference,Ljava/lang/String;);
a=0;//     new-instance v22, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v22=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v23, "MoServerHttpPostResponse() messageType -> "
a=0;// 
a=0;//     #v23=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v22 .. v23}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v22=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     invoke-static/range {v21 .. v22}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 77
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     array-length v0, v12
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     invoke-virtual {v2, v12, v0, v1}, Ljava/io/ByteArrayInputStream;->read([BII)I
a=0;// 
a=0;//     .line 78
a=0;//     const/16 v21, 0x4
a=0;// 
a=0;//     #v21=(PosByte);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v2, v0}, Ljava/io/ByteArrayInputStream;->mark(I)V
a=0;// 
a=0;//     .line 79
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v12, v0}, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostResponse;->bytes4ToInt([BI)I
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     .line 82
a=0;//     .local v20, "transactionID":I
a=0;//     #v20=(Integer);
a=0;//     sget v21, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostResponse;->TRANSACTIONID:I
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     if-eq v0, v1, :cond_1
a=0;// 
a=0;//     .line 84
a=0;//     new-instance v21, Ljava/lang/Exception;
a=0;// 
a=0;//     #v21=(UninitRef,Ljava/lang/Exception;);
a=0;//     new-instance v22, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v22=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v23, "TransactionID error! TransactionID="
a=0;// 
a=0;//     invoke-direct/range {v22 .. v23}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 85
a=0;//     #v22=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     .line 84
a=0;//     invoke-direct/range {v21 .. v22}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v21=(Reference,Ljava/lang/Exception;);
a=0;//     throw v21
a=0;// 
a=0;//     .line 89
a=0;//     :cond_1
a=0;//     #v0=(Integer);v21=(Integer);v22=(Integer);
a=0;//     const/16 v17, 0x2
a=0;// 
a=0;//     .line 91
a=0;//     .local v17, "shortValue":I
a=0;//     #v17=(PosByte);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v10, v0, [B
a=0;// 
a=0;//     .line 93
a=0;//     .local v10, "messageBodyHead":[B
a=0;//     #v10=(Reference,[B);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     array-length v0, v10
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     invoke-virtual {v2, v10, v0, v1}, Ljava/io/ByteArrayInputStream;->read([BII)I
a=0;// 
a=0;//     .line 94
a=0;//     const/16 v21, 0x5
a=0;// 
a=0;//     #v21=(PosByte);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v2, v0}, Ljava/io/ByteArrayInputStream;->mark(I)V
a=0;// 
a=0;//     .line 95
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v10, v0}, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostResponse;->byte2ToShort([BI)S
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     .line 97
a=0;//     .local v16, "returnCode":S
a=0;//     #v16=(Short);
a=0;//     sget v21, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostResponse;->RETUENCODE:I
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Short);
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     if-eq v0, v1, :cond_2
a=0;// 
a=0;//     .line 99
a=0;//     new-instance v21, Ljava/lang/Exception;
a=0;// 
a=0;//     #v21=(UninitRef,Ljava/lang/Exception;);
a=0;//     new-instance v22, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v22=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v23, "ReturnCode error! returnCode="
a=0;// 
a=0;//     invoke-direct/range {v22 .. v23}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v22=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move-object/from16 v0, v22
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     move/from16 v1, v16
a=0;// 
a=0;//     #v1=(Short);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v22
a=0;// 
a=0;//     invoke-direct/range {v21 .. v22}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v21=(Reference,Ljava/lang/Exception;);
a=0;//     throw v21
a=0;// 
a=0;//     .line 104
a=0;//     :cond_2
a=0;//     #v0=(Short);v1=(Integer);v21=(Integer);v22=(Integer);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     array-length v0, v10
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     invoke-virtual {v2, v10, v0, v1}, Ljava/io/ByteArrayInputStream;->read([BII)I
a=0;// 
a=0;//     .line 105
a=0;//     const/16 v21, 0x6
a=0;// 
a=0;//     #v21=(PosByte);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v2, v0}, Ljava/io/ByteArrayInputStream;->mark(I)V
a=0;// 
a=0;//     .line 106
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v10, v0}, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostResponse;->byte2ToShort([BI)S
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 109
a=0;//     .local v8, "itemNumber":S
a=0;//     #v8=(Short);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .local v5, "i":I
a=0;//     #v5=(Null);
a=0;//     move-object/from16 v19, v18
a=0;// 
a=0;//     .end local v18    # "strMessageBody":Ljava/lang/String;
a=0;//     .local v19, "strMessageBody":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Integer);v7=(Conflicted);v9=(Conflicted);v11=(Conflicted);v18=(Reference,Ljava/lang/String;);v19=(Reference,Ljava/lang/String;);v21=(Conflicted);
a=0;//     if-lt v5, v8, :cond_3
a=0;// 
a=0;//     .line 145
a=0;//     return-object v19
a=0;// 
a=0;//     .line 112
a=0;//     :cond_3
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     array-length v0, v10
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v2, v10, v0, v1}, Ljava/io/ByteArrayInputStream;->read([BII)I
a=0;// 
a=0;//     .line 113
a=0;//     const/16 v21, 0x7
a=0;// 
a=0;//     #v21=(PosByte);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v2, v0}, Ljava/io/ByteArrayInputStream;->mark(I)V
a=0;// 
a=0;//     .line 114
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v10, v0}, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostResponse;->byte2ToShort([BI)S
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 118
a=0;//     .local v7, "itemID":S
a=0;//     #v7=(Short);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     array-length v0, v10
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     invoke-virtual {v2, v10, v0, v1}, Ljava/io/ByteArrayInputStream;->read([BII)I
a=0;// 
a=0;//     .line 119
a=0;//     const/16 v21, 0x8
a=0;// 
a=0;//     #v21=(PosByte);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v2, v0}, Ljava/io/ByteArrayInputStream;->mark(I)V
a=0;// 
a=0;//     .line 120
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v10, v0}, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostResponse;->byte2ToShort([BI)S
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 124
a=0;//     .local v9, "itemType":S
a=0;//     #v9=(Short);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     array-length v0, v12
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     invoke-virtual {v2, v12, v0, v1}, Ljava/io/ByteArrayInputStream;->read([BII)I
a=0;// 
a=0;//     .line 125
a=0;//     const/16 v21, 0x9
a=0;// 
a=0;//     #v21=(PosByte);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v2, v0}, Ljava/io/ByteArrayInputStream;->mark(I)V
a=0;// 
a=0;//     .line 126
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v12, v0}, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostResponse;->bytes4ToInt([BI)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 130
a=0;//     .local v3, "bodyLength":I
a=0;//     #v3=(Integer);
a=0;//     move v11, v3
a=0;// 
a=0;//     .line 131
a=0;//     .local v11, "messageBodyLength":I
a=0;//     #v11=(Integer);
a=0;//     new-array v12, v11, [B
a=0;// 
a=0;//     .line 132
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     array-length v0, v12
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     invoke-virtual {v2, v12, v0, v1}, Ljava/io/ByteArrayInputStream;->read([BII)I
a=0;// 
a=0;//     .line 133
a=0;//     const/16 v21, 0xa
a=0;// 
a=0;//     #v21=(PosByte);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v2, v0}, Ljava/io/ByteArrayInputStream;->mark(I)V
a=0;// 
a=0;//     .line 135
a=0;//     :try_start_0
a=0;//     new-instance v18, Ljava/lang/String;
a=0;// 
a=0;//     #v18=(UninitRef,Ljava/lang/String;);
a=0;//     const-string v21, "utf-8"
a=0;// 
a=0;//     #v21=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     move-object/from16 v1, v21
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v12, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 109
a=0;//     .end local v19    # "strMessageBody":Ljava/lang/String;
a=0;//     .restart local v18    # "strMessageBody":Ljava/lang/String;
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v18=(Reference,Ljava/lang/String;);v21=(Conflicted);
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     move-object/from16 v19, v18
a=0;// 
a=0;//     .end local v18    # "strMessageBody":Ljava/lang/String;
a=0;//     .restart local v19    # "strMessageBody":Ljava/lang/String;
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 138
a=0;//     :catch_0
a=0;//     #v18=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     .line 140
a=0;//     .local v4, "e":Ljava/io/UnsupportedEncodingException;
a=0;//     #v4=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     invoke-virtual {v4}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V
a=0;// 
a=0;//     move-object/from16 v18, v19
a=0;// 
a=0;//     .end local v19    # "strMessageBody":Ljava/lang/String;
a=0;//     .restart local v18    # "strMessageBody":Ljava/lang/String;
a=0;//     #v18=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// .end method
}}
