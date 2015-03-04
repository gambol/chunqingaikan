package com.ccit.mmwlan.httpClient; class MoServerHttpPostRequest { void a() { int a;
a=0;// .class public Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MoServerHttpPostRequest.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final ITEMTYPE_BINARYDATA:S = 0x6s
a=0;// 
a=0;// .field public static final ITEMTYPE_Client_Action_Schema:S = 0x7s
a=0;// 
a=0;// .field public static final ITEMTYPE_ContentDescription:S = 0x9s
a=0;// 
a=0;// .field public static final ITEMTYPE_IMAGE:S = 0x3s
a=0;// 
a=0;// .field public static final ITEMTYPE_IP:S = 0x4s
a=0;// 
a=0;// .field public static final ITEMTYPE_SESSIONID:S = 0x1s
a=0;// 
a=0;// .field public static final ITEMTYPE_SMSPORT:S = 0x5s
a=0;// 
a=0;// .field public static final ITEMTYPE_Server_Action_Schema:S = 0x8s
a=0;// 
a=0;// .field public static final ITEMTYPE_XML:S = 0x2s
a=0;// 
a=0;// .field public static POSTUTIL_TAG:Ljava/lang/String;
a=0;// 
a=0;// .field public static PROTOCALVERSION:I
a=0;// 
a=0;// .field public static SESSIONID:I
a=0;// 
a=0;// .field public static TRANSACTIONID:I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private itemBodys:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<[B>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private itemNum:S
a=0;// 
a=0;// .field private itemTypes:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 14
a=0;//     const-string v0, "Default"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;->POSTUTIL_TAG:Ljava/lang/String;
a=0;// 
a=0;//     .line 30
a=0;//     const v0, -0x1020305
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sput v0, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;->PROTOCALVERSION:I
a=0;// 
a=0;//     .line 31
a=0;//     const/16 v0, 0x6f
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     sput v0, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;->TRANSACTIONID:I
a=0;// 
a=0;//     .line 32
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sput v0, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;->SESSIONID:I
a=0;// 
a=0;//     .line 12
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 12
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 34
a=0;//     #p0=(Reference,Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-short v0, p0, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;->itemNum:S
a=0;// 
a=0;//     .line 35
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;->itemTypes:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 36
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;->itemBodys:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 12
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private addItemBody([BS)V
a=0;//     .locals 2
a=0;//     .param p1, "data"    # [B
a=0;//     .param p2, "itemType"    # S
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 60
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 57
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;->itemTypes:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 58
a=0;//     iget-object v0, p0, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;->itemBodys:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 59
a=0;//     iget-short v0, p0, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;->itemNum:S
a=0;// 
a=0;//     #v0=(Short);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-short v0, v0
a=0;// 
a=0;//     #v0=(Short);
a=0;//     iput-short v0, p0, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;->itemNum:S
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private addXmlBody(Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p1, "requestBody"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 51
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 46
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     const-string v2, "UTF-8"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 47
a=0;//     .local v0, "data":[B
a=0;//     #v0=(Reference,[B);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-direct {p0, v0, v2}, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;->addItemBody([BS)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 48
a=0;//     .end local v0    # "data":[B
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 49
a=0;//     .local v1, "ex":Ljava/io/UnsupportedEncodingException;
a=0;//     #v1=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     invoke-virtual {v1}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static byte2ToShort([BI)S
a=0;//     .locals 2
a=0;//     .param p0, "mybytes"    # [B
a=0;//     .param p1, "nOff"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 129
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
a=0;//     .line 142
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
a=0;//     .line 143
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
a=0;//     .line 142
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     .line 144
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
a=0;//     .line 142
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     .line 144
a=0;//     add-int/lit8 v1, p1, 0x3
a=0;// 
a=0;//     aget-byte v1, p0, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     and-int/lit16 v1, v1, 0xff
a=0;// 
a=0;//     .line 142
a=0;//     #v1=(Integer);
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private getItemBodyData()[B
a=0;//     .locals 8
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 69
a=0;//     iget-short v4, p0, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;->itemNum:S
a=0;// 
a=0;//     #v4=(Short);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 70
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 89
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Reference,[B);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 73
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Short);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     new-instance v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 75
a=0;//     .local v0, "baos":Ljava/io/ByteArrayOutputStream;
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     iget-short v4, p0, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;->itemNum:S
a=0;// 
a=0;//     invoke-static {v4}, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;->shortToBytes2(S)[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,[B);
a=0;//     invoke-virtual {v0, v4}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     .line 77
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     iget-short v4, p0, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;->itemNum:S
a=0;// 
a=0;//     #v4=(Short);
a=0;//     if-lt v2, v4, :cond_1
a=0;// 
a=0;//     .line 89
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,[B);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 78
a=0;//     :cond_1
a=0;//     #v4=(Short);
a=0;//     add-int/lit8 v4, v2, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-short v4, v4
a=0;// 
a=0;//     #v4=(Short);
a=0;//     invoke-static {v4}, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;->shortToBytes2(S)[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,[B);
a=0;//     invoke-virtual {v0, v4}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     .line 79
a=0;//     iget-object v4, p0, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;->itemTypes:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v4}, Ljava/lang/Short;->parseShort(Ljava/lang/String;)S
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 80
a=0;//     .local v3, "itemType":S
a=0;//     #v3=(Short);
a=0;//     invoke-static {v3}, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;->shortToBytes2(S)[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     .line 81
a=0;//     iget-object v4, p0, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;->itemBodys:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, [B
a=0;// 
a=0;//     .line 82
a=0;//     .local v1, "data":[B
a=0;//     array-length v4, v1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v4}, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;->intToBytes4(I)[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,[B);
a=0;//     invoke-virtual {v0, v4}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     .line 83
a=0;//     invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     .line 84
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-ne v3, v4, :cond_2
a=0;// 
a=0;//     .line 85
a=0;//     sget-object v4, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;->POSTUTIL_TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "request message body :"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 86
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     new-instance v6, Ljava/lang/String;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/String;);
a=0;//     const-string v7, "UTF-8"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v6, v1, v7}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 85
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 77
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static intToBytes4(I)[B
a=0;//     .locals 6
a=0;//     .param p0, "i"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 133
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v0, v1, [B
a=0;// 
a=0;//     .line 134
a=0;//     .local v0, "mybytes":[B
a=0;//     #v0=(Reference,[B);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     and-int/lit16 v2, p0, 0xff
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-byte v2, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     aput-byte v2, v0, v1
a=0;// 
a=0;//     .line 135
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     const v2, 0xff00
a=0;// 
a=0;//     #v2=(Char);
a=0;//     and-int/2addr v2, p0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     shr-int/lit8 v2, v2, 0x8
a=0;// 
a=0;//     int-to-byte v2, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     aput-byte v2, v0, v1
a=0;// 
a=0;//     .line 136
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/high16 v2, 0xff0000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     and-int/2addr v2, p0
a=0;// 
a=0;//     shr-int/lit8 v2, v2, 0x10
a=0;// 
a=0;//     #v2=(Short);
a=0;//     int-to-byte v2, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     aput-byte v2, v0, v1
a=0;// 
a=0;//     .line 137
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const-wide/32 v2, -0x1000000
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     int-to-long v4, p0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     and-long/2addr v2, v4
a=0;// 
a=0;//     const/16 v4, 0x18
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     shr-long/2addr v2, v4
a=0;// 
a=0;//     long-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-byte v2, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     aput-byte v2, v0, v1
a=0;// 
a=0;//     .line 138
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static shortToBytes2(S)[B
a=0;//     .locals 3
a=0;//     .param p0, "s"    # S
a=0;// 
a=0;//     .prologue
a=0;//     .line 121
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v0, v1, [B
a=0;// 
a=0;//     .line 122
a=0;//     .local v0, "mybytes":[B
a=0;//     #v0=(Reference,[B);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     and-int/lit16 v2, p0, 0xff
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-byte v2, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     aput-byte v2, v0, v1
a=0;// 
a=0;//     .line 123
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const v2, 0xff00
a=0;// 
a=0;//     #v2=(Char);
a=0;//     and-int/2addr v2, p0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     shr-int/lit8 v2, v2, 0x8
a=0;// 
a=0;//     int-to-byte v2, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     aput-byte v2, v0, v1
a=0;// 
a=0;//     .line 125
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getFinalData(Ljava/lang/String;I)[B
a=0;//     .locals 4
a=0;//     .param p1, "requestBody"    # Ljava/lang/String;
a=0;//     .param p2, "msgType"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 101
a=0;//     invoke-direct {p0, p1}, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;->addXmlBody(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 102
a=0;//     invoke-direct {p0}, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;->getItemBodyData()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 103
a=0;//     .local v0, "contentdata":[B
a=0;//     #v0=(Reference,[B);
a=0;//     array-length v3, v0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v1, v3, 0x14
a=0;// 
a=0;//     .line 104
a=0;//     .local v1, "nLength":I
a=0;//     #v1=(Integer);
a=0;//     new-instance v2, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 106
a=0;//     .local v2, "out":Ljava/io/ByteArrayOutputStream;
a=0;//     #v2=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     sget v3, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;->PROTOCALVERSION:I
a=0;// 
a=0;//     invoke-static {v3}, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;->intToBytes4(I)[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,[B);
a=0;//     invoke-virtual {v2, v3}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     .line 107
a=0;//     invoke-static {v1}, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;->intToBytes4(I)[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     .line 108
a=0;//     invoke-static {p2}, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;->intToBytes4(I)[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     .line 109
a=0;//     sget v3, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;->TRANSACTIONID:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;->intToBytes4(I)[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,[B);
a=0;//     invoke-virtual {v2, v3}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     .line 110
a=0;//     sget v3, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;->SESSIONID:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v3}, Lcom/ccit/mmwlan/httpClient/MoServerHttpPostRequest;->intToBytes4(I)[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,[B);
a=0;//     invoke-virtual {v2, v3}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     .line 111
a=0;//     invoke-virtual {v2, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V
a=0;// 
a=0;//     .line 117
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     return-object v3
a=0;// .end method
}}
