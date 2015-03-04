package com.lidroid.xutils.http.client.entity; class BodyParamsEntity { void a() { int a;
a=0;// .class public Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;
a=0;// .super Lorg/apache/http/entity/AbstractHttpEntity;
a=0;// .source "BodyParamsEntity.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Cloneable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private charset:Ljava/lang/String;
a=0;// 
a=0;// .field protected content:[B
a=0;// 
a=0;// .field private dirty:Z
a=0;// 
a=0;// .field private params:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lorg/apache/http/NameValuePair;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 46
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "charset"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     invoke-direct {p0}, Lorg/apache/http/entity/AbstractHttpEntity;-><init>()V
a=0;// 
a=0;//     .line 38
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;->dirty:Z
a=0;// 
a=0;//     .line 40
a=0;//     const-string v0, "UTF-8"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;->charset:Ljava/lang/String;
a=0;// 
a=0;//     .line 50
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 51
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;->charset:Ljava/lang/String;
a=0;// 
a=0;//     .line 53
a=0;//     :cond_0
a=0;//     const-string v0, "application/x-www-form-urlencoded"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;->setContentType(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 54
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;->params:Ljava/util/List;
a=0;// 
a=0;//     .line 55
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/util/List;)V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lorg/apache/http/NameValuePair;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     .local p1, "params":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;-><init>(Ljava/util/List;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 59
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/util/List;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p2, "charset"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lorg/apache/http/NameValuePair;",
a=0;//             ">;",
a=0;//             "Ljava/lang/String;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     .local p1, "params":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
a=0;//     invoke-direct {p0}, Lorg/apache/http/entity/AbstractHttpEntity;-><init>()V
a=0;// 
a=0;//     .line 38
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;->dirty:Z
a=0;// 
a=0;//     .line 40
a=0;//     const-string v0, "UTF-8"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;->charset:Ljava/lang/String;
a=0;// 
a=0;//     .line 63
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 64
a=0;//     iput-object p2, p0, Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;->charset:Ljava/lang/String;
a=0;// 
a=0;//     .line 66
a=0;//     :cond_0
a=0;//     const-string v0, "application/x-www-form-urlencoded"
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;->setContentType(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 67
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;->params:Ljava/util/List;
a=0;// 
a=0;//     .line 68
a=0;//     invoke-direct {p0}, Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;->refreshContent()V
a=0;// 
a=0;//     .line 69
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private refreshContent()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     iget-boolean v1, p0, Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;->dirty:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 86
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;->params:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;->charset:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/lidroid/xutils/http/client/util/URLEncodedUtils;->format(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;->charset:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;->content:[B
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 90
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, p0, Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;->dirty:Z
a=0;// 
a=0;//     .line 92
a=0;//     :cond_0
a=0;//     #v1=(Boolean);
a=0;//     return-void
a=0;// 
a=0;//     .line 87
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 88
a=0;//     .local v0, "e":Ljava/io/UnsupportedEncodingException;
a=0;//     #v0=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Lcom/lidroid/xutils/util/LogUtils;->e(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;
a=0;//     .locals 2
a=0;//     .param p1, "name"    # Ljava/lang/String;
a=0;//     .param p2, "value"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 72
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;->params:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     new-instance v1, Lorg/apache/http/message/BasicNameValuePair;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/message/BasicNameValuePair;);
a=0;//     invoke-direct {v1, p1, p2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/message/BasicNameValuePair;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 73
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;->dirty:Z
a=0;// 
a=0;//     .line 74
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public addParams(Ljava/util/List;)Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lorg/apache/http/NameValuePair;",
a=0;//             ">;)",
a=0;//             "Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     .local p1, "params":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;->params:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 79
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;->dirty:Z
a=0;// 
a=0;//     .line 80
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public clone()Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/CloneNotSupportedException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 127
a=0;//     invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getContent()Ljava/io/InputStream;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 104
a=0;//     invoke-direct {p0}, Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;->refreshContent()V
a=0;// 
a=0;//     .line 105
a=0;//     new-instance v0, Ljava/io/ByteArrayInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayInputStream;);
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;->content:[B
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/ByteArrayInputStream;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getContentLength()J
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     invoke-direct {p0}, Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;->refreshContent()V
a=0;// 
a=0;//     .line 100
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;->content:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     array-length v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public isRepeatable()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 95
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isStreaming()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 123
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public writeTo(Ljava/io/OutputStream;)V
a=0;//     .locals 2
a=0;//     .param p1, "outStream"    # Ljava/io/OutputStream;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 109
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 110
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "Output stream may not be null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 112
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     invoke-direct {p0}, Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;->refreshContent()V
a=0;// 
a=0;//     .line 113
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;->content:[B
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V
a=0;// 
a=0;//     .line 114
a=0;//     invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
a=0;// 
a=0;//     .line 115
a=0;//     return-void
a=0;// .end method
}}
