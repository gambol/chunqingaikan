package com.lidroid.xutils.http.client.multipart; class HttpMultipart { void a() { int a;
a=0;// .class Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;
a=0;// .super Ljava/lang/Object;
a=0;// .source "HttpMultipart.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static synthetic $SWITCH_TABLE$com$lidroid$xutils$http$client$multipart$HttpMultipartMode:[I
a=0;// 
a=0;// .field private static final CR_LF:Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;// .field private static final FIELD_SEP:Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;// .field private static final TWO_DASHES:Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final boundary:Ljava/lang/String;
a=0;// 
a=0;// .field private final charset:Ljava/nio/charset/Charset;
a=0;// 
a=0;// .field private final mode:Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;// 
a=0;// .field private final parts:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private subType:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static synthetic $SWITCH_TABLE$com$lidroid$xutils$http$client$multipart$HttpMultipartMode()[I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->$SWITCH_TABLE$com$lidroid$xutils$http$client$multipart$HttpMultipartMode:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     invoke-static {}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;->values()[Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Reference,[I);
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;->BROWSER_COMPATIBLE:Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;);
a=0;//     invoke-virtual {v1}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     aput v2, v0, v1
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     :goto_1
a=0;//     :try_start_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;->STRICT:Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;);
a=0;//     invoke-virtual {v1}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     aput v2, v0, v1
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_0
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sput-object v0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->$SWITCH_TABLE$com$lidroid$xutils$http$client$multipart$HttpMultipartMode:[I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NoSuchFieldError;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_1
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NoSuchFieldError;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/client/multipart/MIME;->DEFAULT_CHARSET:Ljava/nio/charset/Charset;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/charset/Charset;);
a=0;//     const-string v1, ": "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->encode(Ljava/nio/charset/Charset;Ljava/lang/String;)Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->FIELD_SEP:Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     .line 83
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/client/multipart/MIME;->DEFAULT_CHARSET:Ljava/nio/charset/Charset;
a=0;// 
a=0;//     const-string v1, "\r\n"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->encode(Ljava/nio/charset/Charset;Ljava/lang/String;)Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->CR_LF:Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     .line 84
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/client/multipart/MIME;->DEFAULT_CHARSET:Ljava/nio/charset/Charset;
a=0;// 
a=0;//     const-string v1, "--"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->encode(Ljava/nio/charset/Charset;Ljava/lang/String;)Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->TWO_DASHES:Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     .line 38
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "subType"    # Ljava/lang/String;
a=0;//     .param p2, "boundary"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 132
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0, p2}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;-><init>(Ljava/lang/String;Ljava/nio/charset/Charset;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 133
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;Ljava/nio/charset/Charset;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "subType"    # Ljava/lang/String;
a=0;//     .param p2, "charset"    # Ljava/nio/charset/Charset;
a=0;//     .param p3, "boundary"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 128
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;->STRICT:Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;);
a=0;//     invoke-direct {p0, p1, p2, p3, v0}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;-><init>(Ljava/lang/String;Ljava/nio/charset/Charset;Ljava/lang/String;Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;)V
a=0;// 
a=0;//     .line 129
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;Ljava/nio/charset/Charset;Ljava/lang/String;Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;)V
a=0;//     .locals 2
a=0;//     .param p1, "subType"    # Ljava/lang/String;
a=0;//     .param p2, "charset"    # Ljava/nio/charset/Charset;
a=0;//     .param p3, "boundary"    # Ljava/lang/String;
a=0;//     .param p4, "mode"    # Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;// 
a=0;//     .prologue
a=0;//     .line 104
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 105
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 106
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "Multipart subtype may not be null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 108
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     if-nez p3, :cond_1
a=0;// 
a=0;//     .line 109
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "Multipart boundary may not be null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 111
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->subType:Ljava/lang/String;
a=0;// 
a=0;//     .line 112
a=0;//     if-eqz p2, :cond_2
a=0;// 
a=0;//     .end local p2    # "charset":Ljava/nio/charset/Charset;
a=0;//     :goto_0
a=0;//     iput-object p2, p0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->charset:Ljava/nio/charset/Charset;
a=0;// 
a=0;//     .line 113
a=0;//     iput-object p3, p0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->boundary:Ljava/lang/String;
a=0;// 
a=0;//     .line 114
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->parts:Ljava/util/List;
a=0;// 
a=0;//     .line 115
a=0;//     iput-object p4, p0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->mode:Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;// 
a=0;//     .line 116
a=0;//     return-void
a=0;// 
a=0;//     .line 112
a=0;//     .restart local p2    # "charset":Ljava/nio/charset/Charset;
a=0;//     :cond_2
a=0;//     #v0=(Uninit);
a=0;//     sget-object p2, Lcom/lidroid/xutils/http/client/multipart/MIME;->DEFAULT_CHARSET:Ljava/nio/charset/Charset;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private doWriteTo(Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;Ljava/io/OutputStream;Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;Z)V
a=0;//     .locals 16
a=0;//     .param p1, "mode"    # Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;//     .param p2, "out"    # Ljava/io/OutputStream;
a=0;//     .param p3, "callBackInfo"    # Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;
a=0;//     .param p4, "writeContent"    # Z
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 179
a=0;//     const-wide/16 v9, 0x0
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;);
a=0;//     iput-wide v9, v0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     .line 181
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v9, v0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->charset:Ljava/nio/charset/Charset;
a=0;// 
a=0;//     #v9=(Reference,Ljava/nio/charset/Charset;);
a=0;//     invoke-virtual/range {p0 .. p0}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->getBoundary()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v9, v10}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->encode(Ljava/nio/charset/Charset;Ljava/lang/String;)Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 182
a=0;//     .local v2, "boundary":Lorg/apache/http/util/ByteArrayBuffer;
a=0;//     #v2=(Reference,Lorg/apache/http/util/ByteArrayBuffer;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v9, v0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->parts:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
a=0;//     invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-nez v10, :cond_0
a=0;// 
a=0;//     .line 232
a=0;//     sget-object v9, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->TWO_DASHES:Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-static {v9, v0}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->writeBytes(Lorg/apache/http/util/ByteArrayBuffer;Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 233
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     iget-wide v9, v0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     sget-object v11, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->TWO_DASHES:Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     #v11=(Reference,Lorg/apache/http/util/ByteArrayBuffer;);
a=0;//     invoke-virtual {v11}, Lorg/apache/http/util/ByteArrayBuffer;->length()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     int-to-long v11, v11
a=0;// 
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     add-long/2addr v9, v11
a=0;// 
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     iput-wide v9, v0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     .line 234
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-static {v2, v0}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->writeBytes(Lorg/apache/http/util/ByteArrayBuffer;Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 235
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     iget-wide v9, v0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     invoke-virtual {v2}, Lorg/apache/http/util/ByteArrayBuffer;->length()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     int-to-long v11, v11
a=0;// 
a=0;//     #v11=(LongLo);
a=0;//     add-long/2addr v9, v11
a=0;// 
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     iput-wide v9, v0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     .line 236
a=0;//     sget-object v9, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->TWO_DASHES:Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     #v9=(Reference,Lorg/apache/http/util/ByteArrayBuffer;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-static {v9, v0}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->writeBytes(Lorg/apache/http/util/ByteArrayBuffer;Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 237
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     iget-wide v9, v0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     #v9=(LongLo);
a=0;//     sget-object v11, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->TWO_DASHES:Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     #v11=(Reference,Lorg/apache/http/util/ByteArrayBuffer;);
a=0;//     invoke-virtual {v11}, Lorg/apache/http/util/ByteArrayBuffer;->length()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     int-to-long v11, v11
a=0;// 
a=0;//     #v11=(LongLo);
a=0;//     add-long/2addr v9, v11
a=0;// 
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     iput-wide v9, v0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     .line 238
a=0;//     sget-object v9, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->CR_LF:Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     #v9=(Reference,Lorg/apache/http/util/ByteArrayBuffer;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-static {v9, v0}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->writeBytes(Lorg/apache/http/util/ByteArrayBuffer;Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 239
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     iget-wide v9, v0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     #v9=(LongLo);
a=0;//     sget-object v11, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->CR_LF:Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     #v11=(Reference,Lorg/apache/http/util/ByteArrayBuffer;);
a=0;//     invoke-virtual {v11}, Lorg/apache/http/util/ByteArrayBuffer;->length()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     int-to-long v11, v11
a=0;// 
a=0;//     #v11=(LongLo);
a=0;//     add-long/2addr v9, v11
a=0;// 
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     iput-wide v9, v0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     .line 240
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     invoke-virtual {v0, v9}, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->doCallBack(Z)Z
a=0;// 
a=0;//     .line 241
a=0;//     return-void
a=0;// 
a=0;//     .line 182
a=0;//     :cond_0
a=0;//     #v9=(Reference,Ljava/util/Iterator;);v10=(Boolean);v11=(Conflicted);v12=(Conflicted);
a=0;//     invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v8, Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;
a=0;// 
a=0;//     .line 183
a=0;//     .local v8, "part":Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     invoke-virtual {v0, v10}, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->doCallBack(Z)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-nez v10, :cond_1
a=0;// 
a=0;//     .line 184
a=0;//     new-instance v9, Ljava/io/InterruptedIOException;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/io/InterruptedIOException;);
a=0;//     const-string v10, "stop"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v9, v10}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/io/InterruptedIOException;);
a=0;//     throw v9
a=0;// 
a=0;//     .line 186
a=0;//     :cond_1
a=0;//     #v10=(Boolean);
a=0;//     sget-object v10, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->TWO_DASHES:Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     #v10=(Reference,Lorg/apache/http/util/ByteArrayBuffer;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-static {v10, v0}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->writeBytes(Lorg/apache/http/util/ByteArrayBuffer;Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 187
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     iget-wide v10, v0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     sget-object v12, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->TWO_DASHES:Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     #v12=(Reference,Lorg/apache/http/util/ByteArrayBuffer;);
a=0;//     invoke-virtual {v12}, Lorg/apache/http/util/ByteArrayBuffer;->length()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     int-to-long v12, v12
a=0;// 
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     add-long/2addr v10, v12
a=0;// 
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     iput-wide v10, v0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     .line 188
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-static {v2, v0}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->writeBytes(Lorg/apache/http/util/ByteArrayBuffer;Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 189
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     iget-wide v10, v0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     invoke-virtual {v2}, Lorg/apache/http/util/ByteArrayBuffer;->length()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     int-to-long v12, v12
a=0;// 
a=0;//     #v12=(LongLo);
a=0;//     add-long/2addr v10, v12
a=0;// 
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     iput-wide v10, v0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     .line 190
a=0;//     sget-object v10, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->CR_LF:Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     #v10=(Reference,Lorg/apache/http/util/ByteArrayBuffer;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-static {v10, v0}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->writeBytes(Lorg/apache/http/util/ByteArrayBuffer;Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 191
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     iget-wide v10, v0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     #v10=(LongLo);
a=0;//     sget-object v12, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->CR_LF:Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     #v12=(Reference,Lorg/apache/http/util/ByteArrayBuffer;);
a=0;//     invoke-virtual {v12}, Lorg/apache/http/util/ByteArrayBuffer;->length()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     int-to-long v12, v12
a=0;// 
a=0;//     #v12=(LongLo);
a=0;//     add-long/2addr v10, v12
a=0;// 
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     iput-wide v10, v0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     .line 193
a=0;//     invoke-virtual {v8}, Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;->getHeader()Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 195
a=0;//     .local v7, "header":Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;
a=0;//     #v7=(Reference,Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;);
a=0;//     invoke-static {}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->$SWITCH_TABLE$com$lidroid$xutils$http$client$multipart$HttpMultipartMode()[I
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,[I);
a=0;//     invoke-virtual/range {p1 .. p1}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;->ordinal()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     aget v10, v10, v11
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     packed-switch v10, :pswitch_data_0
a=0;// 
a=0;//     .line 221
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     sget-object v10, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->CR_LF:Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     #v10=(Reference,Lorg/apache/http/util/ByteArrayBuffer;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-static {v10, v0}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->writeBytes(Lorg/apache/http/util/ByteArrayBuffer;Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 222
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     iget-wide v10, v0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     sget-object v12, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->CR_LF:Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     #v12=(Reference,Lorg/apache/http/util/ByteArrayBuffer;);
a=0;//     invoke-virtual {v12}, Lorg/apache/http/util/ByteArrayBuffer;->length()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     int-to-long v12, v12
a=0;// 
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     add-long/2addr v10, v12
a=0;// 
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     iput-wide v10, v0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     .line 224
a=0;//     if-eqz p4, :cond_3
a=0;// 
a=0;//     .line 225
a=0;//     invoke-virtual {v8}, Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;->getBody()Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 226
a=0;//     .local v1, "body":Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;);
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     invoke-interface {v1, v0}, Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;->setCallBackInfo(Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;)V
a=0;// 
a=0;//     .line 227
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-interface {v1, v0}, Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;->writeTo(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 229
a=0;//     .end local v1    # "body":Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     sget-object v10, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->CR_LF:Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     #v10=(Reference,Lorg/apache/http/util/ByteArrayBuffer;);
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-static {v10, v0}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->writeBytes(Lorg/apache/http/util/ByteArrayBuffer;Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 230
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     iget-wide v10, v0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     #v10=(LongLo);
a=0;//     sget-object v12, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->CR_LF:Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     #v12=(Reference,Lorg/apache/http/util/ByteArrayBuffer;);
a=0;//     invoke-virtual {v12}, Lorg/apache/http/util/ByteArrayBuffer;->length()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     int-to-long v12, v12
a=0;// 
a=0;//     #v12=(LongLo);
a=0;//     add-long/2addr v10, v12
a=0;// 
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     iput-wide v10, v0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 197
a=0;//     :pswitch_0
a=0;//     #v10=(Integer);v11=(Integer);
a=0;//     invoke-virtual {v7}, Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     :goto_2
a=0;//     #v10=(Reference,Ljava/util/Iterator;);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-eqz v11, :cond_2
a=0;// 
a=0;//     invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v5, Lcom/lidroid/xutils/http/client/multipart/MinimalField;
a=0;// 
a=0;//     .line 198
a=0;//     .local v5, "field":Lcom/lidroid/xutils/http/client/multipart/MinimalField;
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-static {v5, v0}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->writeField(Lcom/lidroid/xutils/http/client/multipart/MinimalField;Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 199
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     iget-wide v11, v0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     #v11=(LongLo);v12=(LongHi);
a=0;//     sget-object v13, Lcom/lidroid/xutils/http/client/multipart/MIME;->DEFAULT_CHARSET:Ljava/nio/charset/Charset;
a=0;// 
a=0;//     .line 200
a=0;//     #v13=(Reference,Ljava/nio/charset/Charset;);
a=0;//     new-instance v14, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v14=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5}, Lcom/lidroid/xutils/http/client/multipart/MinimalField;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     #v15=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v15}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5}, Lcom/lidroid/xutils/http/client/multipart/MinimalField;->getBody()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 199
a=0;//     invoke-static {v13, v14}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->encode(Ljava/nio/charset/Charset;Ljava/lang/String;)Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 200
a=0;//     invoke-virtual {v13}, Lorg/apache/http/util/ByteArrayBuffer;->length()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     sget-object v14, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->FIELD_SEP:Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     invoke-virtual {v14}, Lorg/apache/http/util/ByteArrayBuffer;->length()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 199
a=0;//     #v14=(Integer);
a=0;//     add-int/2addr v13, v14
a=0;// 
a=0;//     .line 200
a=0;//     sget-object v14, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->CR_LF:Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     #v14=(Reference,Lorg/apache/http/util/ByteArrayBuffer;);
a=0;//     invoke-virtual {v14}, Lorg/apache/http/util/ByteArrayBuffer;->length()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     add-int/2addr v13, v14
a=0;// 
a=0;//     int-to-long v13, v13
a=0;// 
a=0;//     #v13=(LongLo);v14=(LongHi);
a=0;//     add-long/2addr v11, v13
a=0;// 
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     iput-wide v11, v0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 206
a=0;//     .end local v5    # "field":Lcom/lidroid/xutils/http/client/multipart/MinimalField;
a=0;//     :pswitch_1
a=0;//     #v5=(Conflicted);v10=(Integer);v11=(Integer);v12=(LongLo);v13=(LongHi);v14=(Conflicted);v15=(Conflicted);
a=0;//     const-string v10, "Content-Disposition"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v10}, Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;->getField(Ljava/lang/String;)Lcom/lidroid/xutils/http/client/multipart/MinimalField;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 207
a=0;//     .local v3, "cd":Lcom/lidroid/xutils/http/client/multipart/MinimalField;
a=0;//     #v3=(Reference,Lcom/lidroid/xutils/http/client/multipart/MinimalField;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v10, v0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->charset:Ljava/nio/charset/Charset;
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-static {v3, v10, v0}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->writeField(Lcom/lidroid/xutils/http/client/multipart/MinimalField;Ljava/nio/charset/Charset;Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 208
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     iget-wide v10, v0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     #v10=(LongLo);v11=(LongHi);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v12, v0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->charset:Ljava/nio/charset/Charset;
a=0;// 
a=0;//     .line 209
a=0;//     #v12=(Reference,Ljava/nio/charset/Charset;);
a=0;//     new-instance v13, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3}, Lcom/lidroid/xutils/http/client/multipart/MinimalField;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v14}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3}, Lcom/lidroid/xutils/http/client/multipart/MinimalField;->getBody()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 208
a=0;//     invoke-static {v12, v13}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->encode(Ljava/nio/charset/Charset;Ljava/lang/String;)Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 209
a=0;//     invoke-virtual {v12}, Lorg/apache/http/util/ByteArrayBuffer;->length()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     sget-object v13, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->FIELD_SEP:Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     invoke-virtual {v13}, Lorg/apache/http/util/ByteArrayBuffer;->length()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     .line 208
a=0;//     #v13=(Integer);
a=0;//     add-int/2addr v12, v13
a=0;// 
a=0;//     .line 209
a=0;//     sget-object v13, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->CR_LF:Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     #v13=(Reference,Lorg/apache/http/util/ByteArrayBuffer;);
a=0;//     invoke-virtual {v13}, Lorg/apache/http/util/ByteArrayBuffer;->length()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     add-int/2addr v12, v13
a=0;// 
a=0;//     int-to-long v12, v12
a=0;// 
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     add-long/2addr v10, v12
a=0;// 
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     iput-wide v10, v0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     .line 210
a=0;//     invoke-virtual {v8}, Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;->getBody()Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;);
a=0;//     invoke-interface {v10}, Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;->getFilename()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 211
a=0;//     .local v6, "filename":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 212
a=0;//     const-string v10, "Content-Type"
a=0;// 
a=0;//     invoke-virtual {v7, v10}, Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;->getField(Ljava/lang/String;)Lcom/lidroid/xutils/http/client/multipart/MinimalField;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 213
a=0;//     .local v4, "ct":Lcom/lidroid/xutils/http/client/multipart/MinimalField;
a=0;//     #v4=(Reference,Lcom/lidroid/xutils/http/client/multipart/MinimalField;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v10, v0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->charset:Ljava/nio/charset/Charset;
a=0;// 
a=0;//     move-object/from16 v0, p2
a=0;// 
a=0;//     invoke-static {v4, v10, v0}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->writeField(Lcom/lidroid/xutils/http/client/multipart/MinimalField;Ljava/nio/charset/Charset;Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 214
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     iget-wide v10, v0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     #v10=(LongLo);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v12, v0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->charset:Ljava/nio/charset/Charset;
a=0;// 
a=0;//     .line 215
a=0;//     #v12=(Reference,Ljava/nio/charset/Charset;);
a=0;//     new-instance v13, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v13=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4}, Lcom/lidroid/xutils/http/client/multipart/MinimalField;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-static {v14}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4}, Lcom/lidroid/xutils/http/client/multipart/MinimalField;->getBody()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     .line 214
a=0;//     invoke-static {v12, v13}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->encode(Ljava/nio/charset/Charset;Ljava/lang/String;)Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     .line 215
a=0;//     invoke-virtual {v12}, Lorg/apache/http/util/ByteArrayBuffer;->length()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     sget-object v13, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->FIELD_SEP:Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     invoke-virtual {v13}, Lorg/apache/http/util/ByteArrayBuffer;->length()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     .line 214
a=0;//     #v13=(Integer);
a=0;//     add-int/2addr v12, v13
a=0;// 
a=0;//     .line 215
a=0;//     sget-object v13, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->CR_LF:Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     #v13=(Reference,Lorg/apache/http/util/ByteArrayBuffer;);
a=0;//     invoke-virtual {v13}, Lorg/apache/http/util/ByteArrayBuffer;->length()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     add-int/2addr v12, v13
a=0;// 
a=0;//     int-to-long v12, v12
a=0;// 
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     add-long/2addr v10, v12
a=0;// 
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     iput-wide v10, v0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->pos:J
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 195
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);v13=(Unknown);v14=(Unknown);v15=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);p4=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private doWriteTo(Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;Ljava/io/OutputStream;Z)V
a=0;//     .locals 1
a=0;//     .param p1, "mode"    # Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;//     .param p2, "out"    # Ljava/io/OutputStream;
a=0;//     .param p3, "writeContent"    # Z
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 170
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;->DEFAULT:Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;);
a=0;//     invoke-direct {p0, p1, p2, v0, p3}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->doWriteTo(Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;Ljava/io/OutputStream;Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;Z)V
a=0;// 
a=0;//     .line 171
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static encode(Ljava/nio/charset/Charset;Ljava/lang/String;)Lorg/apache/http/util/ByteArrayBuffer;
a=0;//     .locals 5
a=0;//     .param p0, "charset"    # Ljava/nio/charset/Charset;
a=0;//     .param p1, "string"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 42
a=0;//     invoke-static {p1}, Ljava/nio/CharBuffer;->wrap(Ljava/lang/CharSequence;)Ljava/nio/CharBuffer;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/nio/CharBuffer;);
a=0;//     invoke-virtual {p0, v2}, Ljava/nio/charset/Charset;->encode(Ljava/nio/CharBuffer;)Ljava/nio/ByteBuffer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 43
a=0;//     .local v1, "encoded":Ljava/nio/ByteBuffer;
a=0;//     #v1=(Reference,Ljava/nio/ByteBuffer;);
a=0;//     new-instance v0, Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/util/ByteArrayBuffer;);
a=0;//     invoke-virtual {v1}, Ljava/nio/ByteBuffer;->remaining()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {v0, v2}, Lorg/apache/http/util/ByteArrayBuffer;-><init>(I)V
a=0;// 
a=0;//     .line 44
a=0;//     .local v0, "bab":Lorg/apache/http/util/ByteArrayBuffer;
a=0;//     #v0=(Reference,Lorg/apache/http/util/ByteArrayBuffer;);
a=0;//     invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,[B);
a=0;//     invoke-virtual {v1}, Ljava/nio/ByteBuffer;->position()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1}, Ljava/nio/ByteBuffer;->remaining()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0, v2, v3, v4}, Lorg/apache/http/util/ByteArrayBuffer;->append([BII)V
a=0;// 
a=0;//     .line 45
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static writeBytes(Ljava/lang/String;Ljava/io/OutputStream;)V
a=0;//     .locals 2
a=0;//     .param p0, "s"    # Ljava/lang/String;
a=0;//     .param p1, "out"    # Ljava/io/OutputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/multipart/MIME;->DEFAULT_CHARSET:Ljava/nio/charset/Charset;
a=0;// 
a=0;//     #v1=(Reference,Ljava/nio/charset/Charset;);
a=0;//     invoke-static {v1, p0}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->encode(Ljava/nio/charset/Charset;Ljava/lang/String;)Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 63
a=0;//     .local v0, "b":Lorg/apache/http/util/ByteArrayBuffer;
a=0;//     #v0=(Reference,Lorg/apache/http/util/ByteArrayBuffer;);
a=0;//     invoke-static {v0, p1}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->writeBytes(Lorg/apache/http/util/ByteArrayBuffer;Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 64
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static writeBytes(Ljava/lang/String;Ljava/nio/charset/Charset;Ljava/io/OutputStream;)V
a=0;//     .locals 1
a=0;//     .param p0, "s"    # Ljava/lang/String;
a=0;//     .param p1, "charset"    # Ljava/nio/charset/Charset;
a=0;//     .param p2, "out"    # Ljava/io/OutputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     invoke-static {p1, p0}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->encode(Ljava/nio/charset/Charset;Ljava/lang/String;)Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 57
a=0;//     .local v0, "b":Lorg/apache/http/util/ByteArrayBuffer;
a=0;//     #v0=(Reference,Lorg/apache/http/util/ByteArrayBuffer;);
a=0;//     invoke-static {v0, p2}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->writeBytes(Lorg/apache/http/util/ByteArrayBuffer;Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 58
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static writeBytes(Lorg/apache/http/util/ByteArrayBuffer;Ljava/io/OutputStream;)V
a=0;//     .locals 3
a=0;//     .param p0, "b"    # Lorg/apache/http/util/ByteArrayBuffer;
a=0;//     .param p1, "out"    # Ljava/io/OutputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     invoke-virtual {p0}, Lorg/apache/http/util/ByteArrayBuffer;->buffer()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Lorg/apache/http/util/ByteArrayBuffer;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1, v0, v1, v2}, Ljava/io/OutputStream;->write([BII)V
a=0;// 
a=0;//     .line 51
a=0;//     invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
a=0;// 
a=0;//     .line 52
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static writeField(Lcom/lidroid/xutils/http/client/multipart/MinimalField;Ljava/io/OutputStream;)V
a=0;//     .locals 1
a=0;//     .param p0, "field"    # Lcom/lidroid/xutils/http/client/multipart/MinimalField;
a=0;//     .param p1, "out"    # Ljava/io/OutputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     invoke-virtual {p0}, Lcom/lidroid/xutils/http/client/multipart/MinimalField;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, p1}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->writeBytes(Ljava/lang/String;Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 69
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->FIELD_SEP:Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     invoke-static {v0, p1}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->writeBytes(Lorg/apache/http/util/ByteArrayBuffer;Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 70
a=0;//     invoke-virtual {p0}, Lcom/lidroid/xutils/http/client/multipart/MinimalField;->getBody()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0, p1}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->writeBytes(Ljava/lang/String;Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 71
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->CR_LF:Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     invoke-static {v0, p1}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->writeBytes(Lorg/apache/http/util/ByteArrayBuffer;Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 72
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static writeField(Lcom/lidroid/xutils/http/client/multipart/MinimalField;Ljava/nio/charset/Charset;Ljava/io/OutputStream;)V
a=0;//     .locals 1
a=0;//     .param p0, "field"    # Lcom/lidroid/xutils/http/client/multipart/MinimalField;
a=0;//     .param p1, "charset"    # Ljava/nio/charset/Charset;
a=0;//     .param p2, "out"    # Ljava/io/OutputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     invoke-virtual {p0}, Lcom/lidroid/xutils/http/client/multipart/MinimalField;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, p1, p2}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->writeBytes(Ljava/lang/String;Ljava/nio/charset/Charset;Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 77
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->FIELD_SEP:Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     invoke-static {v0, p2}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->writeBytes(Lorg/apache/http/util/ByteArrayBuffer;Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 78
a=0;//     invoke-virtual {p0}, Lcom/lidroid/xutils/http/client/multipart/MinimalField;->getBody()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0, p1, p2}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->writeBytes(Ljava/lang/String;Ljava/nio/charset/Charset;Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 79
a=0;//     sget-object v0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->CR_LF:Lorg/apache/http/util/ByteArrayBuffer;
a=0;// 
a=0;//     invoke-static {v0, p2}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->writeBytes(Lorg/apache/http/util/ByteArrayBuffer;Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 80
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addBodyPart(Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;)V
a=0;//     .locals 1
a=0;//     .param p1, "part"    # Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;
a=0;// 
a=0;//     .prologue
a=0;//     .line 156
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 160
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 159
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->parts:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getBodyParts()Ljava/util/List;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->parts:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getBoundary()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 163
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->boundary:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getCharset()Ljava/nio/charset/Charset;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 144
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->charset:Ljava/nio/charset/Charset;
a=0;// 
a=0;//     #v0=(Reference,Ljava/nio/charset/Charset;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getMode()Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 148
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->mode:Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getSubType()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 140
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->subType:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTotalLength()J
a=0;//     .locals 14
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v9, -0x1
a=0;// 
a=0;//     .line 268
a=0;//     #v9=(LongLo);v10=(LongHi);
a=0;//     const-wide/16 v1, 0x0
a=0;// 
a=0;//     .line 269
a=0;//     .local v1, "contentLen":J
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     iget-object v11, p0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->parts:Ljava/util/List;
a=0;// 
a=0;//     #v11=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-nez v12, :cond_1
a=0;// 
a=0;//     .line 278
a=0;//     new-instance v7, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v7}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 280
a=0;//     .local v7, "out":Ljava/io/ByteArrayOutputStream;
a=0;//     :try_start_0
a=0;//     #v7=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     iget-object v11, p0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->mode:Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;// 
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     invoke-direct {p0, v11, v7, v12}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->doWriteTo(Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;Ljava/io/OutputStream;Z)V
a=0;// 
a=0;//     .line 281
a=0;//     invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 282
a=0;//     .local v4, "extra":[B
a=0;//     #v4=(Reference,[B);
a=0;//     array-length v9, v4
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     int-to-long v9, v9
a=0;// 
a=0;//     #v9=(LongLo);
a=0;//     add-long/2addr v9, v1
a=0;// 
a=0;//     .line 285
a=0;//     .end local v4    # "extra":[B
a=0;//     .end local v7    # "out":Ljava/io/ByteArrayOutputStream;
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);v12=(Byte);
a=0;//     return-wide v9
a=0;// 
a=0;//     .line 269
a=0;//     :cond_1
a=0;//     #v3=(Uninit);v4=(Uninit);v7=(Uninit);v12=(Boolean);
a=0;//     invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v8, Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;
a=0;// 
a=0;//     .line 270
a=0;//     .local v8, "part":Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;
a=0;//     invoke-virtual {v8}, Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;->getBody()Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 271
a=0;//     .local v0, "body":Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;);
a=0;//     invoke-interface {v0}, Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;->getContentLength()J
a=0;// 
a=0;//     move-result-wide v5
a=0;// 
a=0;//     .line 272
a=0;//     .local v5, "len":J
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     const-wide/16 v12, 0x0
a=0;// 
a=0;//     #v12=(LongLo);v13=(LongHi);
a=0;//     cmp-long v12, v5, v12
a=0;// 
a=0;//     #v12=(Byte);
a=0;//     if-ltz v12, :cond_0
a=0;// 
a=0;//     .line 273
a=0;//     add-long/2addr v1, v5
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 283
a=0;//     .end local v0    # "body":Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;
a=0;//     .end local v5    # "len":J
a=0;//     .end local v8    # "part":Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;
a=0;//     .restart local v7    # "out":Ljava/io/ByteArrayOutputStream;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Reference,Ljava/io/ByteArrayOutputStream;);v8=(Conflicted);v12=(Boolean);v13=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     .line 285
a=0;//     .local v3, "ex":Ljava/lang/Throwable;
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public setSubType(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "subType"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 136
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->subType:Ljava/lang/String;
a=0;// 
a=0;//     .line 137
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public writeTo(Ljava/io/OutputStream;Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;)V
a=0;//     .locals 2
a=0;//     .param p1, "out"    # Ljava/io/OutputStream;
a=0;//     .param p2, "callBackInfo"    # Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 251
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->mode:Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-direct {p0, v0, p1, p2, v1}, Lcom/lidroid/xutils/http/client/multipart/HttpMultipart;->doWriteTo(Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;Ljava/io/OutputStream;Lcom/lidroid/xutils/http/client/multipart/MultipartEntity$CallBackInfo;Z)V
a=0;// 
a=0;//     .line 252
a=0;//     return-void
a=0;// .end method
}}
