package com.lidroid.xutils.http; class RequestParams { void a() { int a;
a=0;// .class public Lcom/lidroid/xutils/http/RequestParams;
a=0;// .super Ljava/lang/Object;
a=0;// .source "RequestParams.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/lidroid/xutils/http/RequestParams$HeaderItem;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private bodyEntity:Lorg/apache/http/HttpEntity;
a=0;// 
a=0;// .field private bodyParams:Ljava/util/List;
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
a=0;// .field private charset:Ljava/lang/String;
a=0;// 
a=0;// .field private fileParams:Ljava/util/HashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private headers:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/lidroid/xutils/http/RequestParams$HeaderItem;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private queryStringParams:Ljava/util/List;
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
a=0;//     .line 54
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 46
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/RequestParams;);
a=0;//     const-string v0, "UTF-8"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->charset:Ljava/lang/String;
a=0;// 
a=0;//     .line 55
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "charset"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 46
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/RequestParams;);
a=0;//     const-string v0, "UTF-8"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->charset:Ljava/lang/String;
a=0;// 
a=0;//     .line 58
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 59
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/RequestParams;->charset:Ljava/lang/String;
a=0;// 
a=0;//     .line 61
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addBodyParameter(Ljava/lang/String;Ljava/io/File;)V
a=0;//     .locals 2
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;//     .param p2, "file"    # Ljava/io/File;
a=0;// 
a=0;//     .prologue
a=0;//     .line 202
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->fileParams:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 203
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->fileParams:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 205
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->fileParams:Ljava/util/HashMap;
a=0;// 
a=0;//     new-instance v1, Lcom/lidroid/xutils/http/client/multipart/content/FileBody;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/lidroid/xutils/http/client/multipart/content/FileBody;);
a=0;//     invoke-direct {v1, p2}, Lcom/lidroid/xutils/http/client/multipart/content/FileBody;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/client/multipart/content/FileBody;);
a=0;//     invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 206
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addBodyParameter(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;//     .param p2, "file"    # Ljava/io/File;
a=0;//     .param p3, "mimeType"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 209
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->fileParams:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 210
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->fileParams:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 212
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->fileParams:Ljava/util/HashMap;
a=0;// 
a=0;//     new-instance v1, Lcom/lidroid/xutils/http/client/multipart/content/FileBody;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/lidroid/xutils/http/client/multipart/content/FileBody;);
a=0;//     invoke-direct {v1, p2, p3}, Lcom/lidroid/xutils/http/client/multipart/content/FileBody;-><init>(Ljava/io/File;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/client/multipart/content/FileBody;);
a=0;//     invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 213
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addBodyParameter(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;//     .param p2, "file"    # Ljava/io/File;
a=0;//     .param p3, "mimeType"    # Ljava/lang/String;
a=0;//     .param p4, "charset"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 216
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->fileParams:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 217
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->fileParams:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 219
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->fileParams:Ljava/util/HashMap;
a=0;// 
a=0;//     new-instance v1, Lcom/lidroid/xutils/http/client/multipart/content/FileBody;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/lidroid/xutils/http/client/multipart/content/FileBody;);
a=0;//     invoke-direct {v1, p2, p3, p4}, Lcom/lidroid/xutils/http/client/multipart/content/FileBody;-><init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/client/multipart/content/FileBody;);
a=0;//     invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 220
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addBodyParameter(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;//     .param p2, "file"    # Ljava/io/File;
a=0;//     .param p3, "fileName"    # Ljava/lang/String;
a=0;//     .param p4, "mimeType"    # Ljava/lang/String;
a=0;//     .param p5, "charset"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 223
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->fileParams:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 224
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->fileParams:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 226
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->fileParams:Ljava/util/HashMap;
a=0;// 
a=0;//     new-instance v1, Lcom/lidroid/xutils/http/client/multipart/content/FileBody;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/lidroid/xutils/http/client/multipart/content/FileBody;);
a=0;//     invoke-direct {v1, p2, p3, p4, p5}, Lcom/lidroid/xutils/http/client/multipart/content/FileBody;-><init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/client/multipart/content/FileBody;);
a=0;//     invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 227
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addBodyParameter(Ljava/lang/String;Ljava/io/InputStream;J)V
a=0;//     .locals 2
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;//     .param p2, "stream"    # Ljava/io/InputStream;
a=0;//     .param p3, "length"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 230
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->fileParams:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 231
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->fileParams:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 233
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->fileParams:Ljava/util/HashMap;
a=0;// 
a=0;//     new-instance v1, Lcom/lidroid/xutils/http/client/multipart/content/InputStreamBody;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/lidroid/xutils/http/client/multipart/content/InputStreamBody;);
a=0;//     invoke-direct {v1, p2, p3, p4}, Lcom/lidroid/xutils/http/client/multipart/content/InputStreamBody;-><init>(Ljava/io/InputStream;J)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/client/multipart/content/InputStreamBody;);
a=0;//     invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 234
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addBodyParameter(Ljava/lang/String;Ljava/io/InputStream;JLjava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;//     .param p2, "stream"    # Ljava/io/InputStream;
a=0;//     .param p3, "length"    # J
a=0;//     .param p5, "fileName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 237
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->fileParams:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 238
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->fileParams:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 240
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->fileParams:Ljava/util/HashMap;
a=0;// 
a=0;//     new-instance v1, Lcom/lidroid/xutils/http/client/multipart/content/InputStreamBody;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/lidroid/xutils/http/client/multipart/content/InputStreamBody;);
a=0;//     invoke-direct {v1, p2, p3, p4, p5}, Lcom/lidroid/xutils/http/client/multipart/content/InputStreamBody;-><init>(Ljava/io/InputStream;JLjava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/client/multipart/content/InputStreamBody;);
a=0;//     invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 241
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addBodyParameter(Ljava/lang/String;Ljava/io/InputStream;JLjava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 7
a=0;//     .param p1, "key"    # Ljava/lang/String;
a=0;//     .param p2, "stream"    # Ljava/io/InputStream;
a=0;//     .param p3, "length"    # J
a=0;//     .param p5, "fileName"    # Ljava/lang/String;
a=0;//     .param p6, "mimeType"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 244
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->fileParams:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 245
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->fileParams:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 247
a=0;//     :cond_0
a=0;//     iget-object v6, p0, Lcom/lidroid/xutils/http/RequestParams;->fileParams:Ljava/util/HashMap;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/HashMap;);
a=0;//     new-instance v0, Lcom/lidroid/xutils/http/client/multipart/content/InputStreamBody;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/http/client/multipart/content/InputStreamBody;);
a=0;//     move-object v1, p2
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/InputStream;);
a=0;//     move-wide v2, p3
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     move-object v4, p5
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     move-object v5, p6
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/lidroid/xutils/http/client/multipart/content/InputStreamBody;-><init>(Ljava/io/InputStream;JLjava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/multipart/content/InputStreamBody;);
a=0;//     invoke-virtual {v6, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 248
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addBodyParameter(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "name"    # Ljava/lang/String;
a=0;//     .param p2, "value"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 177
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->bodyParams:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 178
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->bodyParams:Ljava/util/List;
a=0;// 
a=0;//     .line 180
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->bodyParams:Ljava/util/List;
a=0;// 
a=0;//     new-instance v1, Lorg/apache/http/message/BasicNameValuePair;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/message/BasicNameValuePair;);
a=0;//     invoke-direct {v1, p1, p2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/message/BasicNameValuePair;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 181
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addBodyParameter(Ljava/util/List;)V
a=0;//     .locals 3
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
a=0;//     .line 191
a=0;//     .local p1, "nameValuePairs":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/http/RequestParams;->bodyParams:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 192
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v1, p0, Lcom/lidroid/xutils/http/RequestParams;->bodyParams:Ljava/util/List;
a=0;// 
a=0;//     .line 194
a=0;//     :cond_0
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_1
a=0;// 
a=0;//     .line 195
a=0;//     invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Iterator;);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 199
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 195
a=0;//     :cond_2
a=0;//     #v1=(Reference,Ljava/util/Iterator;);v2=(Boolean);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lorg/apache/http/NameValuePair;
a=0;// 
a=0;//     .line 196
a=0;//     .local v0, "pair":Lorg/apache/http/NameValuePair;
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/RequestParams;->bodyParams:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public addBodyParameter(Lorg/apache/http/NameValuePair;)V
a=0;//     .locals 1
a=0;//     .param p1, "nameValuePair"    # Lorg/apache/http/NameValuePair;
a=0;// 
a=0;//     .prologue
a=0;//     .line 184
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->bodyParams:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 185
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->bodyParams:Ljava/util/List;
a=0;// 
a=0;//     .line 187
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->bodyParams:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 188
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "name"    # Ljava/lang/String;
a=0;//     .param p2, "value"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->headers:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 91
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->headers:Ljava/util/List;
a=0;// 
a=0;//     .line 93
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->headers:Ljava/util/List;
a=0;// 
a=0;//     new-instance v1, Lcom/lidroid/xutils/http/RequestParams$HeaderItem;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/lidroid/xutils/http/RequestParams$HeaderItem;);
a=0;//     invoke-direct {v1, p0, p1, p2}, Lcom/lidroid/xutils/http/RequestParams$HeaderItem;-><init>(Lcom/lidroid/xutils/http/RequestParams;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/RequestParams$HeaderItem;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 94
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addHeader(Lorg/apache/http/Header;)V
a=0;//     .locals 2
a=0;//     .param p1, "header"    # Lorg/apache/http/Header;
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->headers:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 78
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->headers:Ljava/util/List;
a=0;// 
a=0;//     .line 80
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->headers:Ljava/util/List;
a=0;// 
a=0;//     new-instance v1, Lcom/lidroid/xutils/http/RequestParams$HeaderItem;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/lidroid/xutils/http/RequestParams$HeaderItem;);
a=0;//     invoke-direct {v1, p0, p1}, Lcom/lidroid/xutils/http/RequestParams$HeaderItem;-><init>(Lcom/lidroid/xutils/http/RequestParams;Lorg/apache/http/Header;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/RequestParams$HeaderItem;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 81
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addHeaders(Ljava/util/List;)V
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lorg/apache/http/Header;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     .local p1, "headers":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/Header;>;"
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/http/RequestParams;->headers:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 103
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v1, p0, Lcom/lidroid/xutils/http/RequestParams;->headers:Ljava/util/List;
a=0;// 
a=0;//     .line 105
a=0;//     :cond_0
a=0;//     invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 108
a=0;//     return-void
a=0;// 
a=0;//     .line 105
a=0;//     :cond_1
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lorg/apache/http/Header;
a=0;// 
a=0;//     .line 106
a=0;//     .local v0, "header":Lorg/apache/http/Header;
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/RequestParams;->headers:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     new-instance v3, Lcom/lidroid/xutils/http/RequestParams$HeaderItem;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/lidroid/xutils/http/RequestParams$HeaderItem;);
a=0;//     invoke-direct {v3, p0, v0}, Lcom/lidroid/xutils/http/RequestParams$HeaderItem;-><init>(Lcom/lidroid/xutils/http/RequestParams;Lorg/apache/http/Header;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/lidroid/xutils/http/RequestParams$HeaderItem;);
a=0;//     invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public addQueryStringParameter(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "name"    # Ljava/lang/String;
a=0;//     .param p2, "value"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->queryStringParams:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 153
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->queryStringParams:Ljava/util/List;
a=0;// 
a=0;//     .line 155
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->queryStringParams:Ljava/util/List;
a=0;// 
a=0;//     new-instance v1, Lorg/apache/http/message/BasicNameValuePair;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/message/BasicNameValuePair;);
a=0;//     invoke-direct {v1, p1, p2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/message/BasicNameValuePair;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 156
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addQueryStringParameter(Ljava/util/List;)V
a=0;//     .locals 3
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
a=0;//     .line 166
a=0;//     .local p1, "nameValuePairs":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/http/RequestParams;->queryStringParams:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 167
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v1, p0, Lcom/lidroid/xutils/http/RequestParams;->queryStringParams:Ljava/util/List;
a=0;// 
a=0;//     .line 169
a=0;//     :cond_0
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     invoke-interface {p1}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_1
a=0;// 
a=0;//     .line 170
a=0;//     invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Iterator;);v2=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 174
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 170
a=0;//     :cond_2
a=0;//     #v1=(Reference,Ljava/util/Iterator;);v2=(Boolean);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lorg/apache/http/NameValuePair;
a=0;// 
a=0;//     .line 171
a=0;//     .local v0, "pair":Lorg/apache/http/NameValuePair;
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/RequestParams;->queryStringParams:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public addQueryStringParameter(Lorg/apache/http/NameValuePair;)V
a=0;//     .locals 1
a=0;//     .param p1, "nameValuePair"    # Lorg/apache/http/NameValuePair;
a=0;// 
a=0;//     .prologue
a=0;//     .line 159
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->queryStringParams:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 160
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->queryStringParams:Ljava/util/List;
a=0;// 
a=0;//     .line 162
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->queryStringParams:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 163
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getCharset()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 64
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->charset:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getEntity()Lorg/apache/http/HttpEntity;
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     .line 267
a=0;//     iget-object v5, p0, Lcom/lidroid/xutils/http/RequestParams;->bodyEntity:Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     #v5=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 268
a=0;//     iget-object v4, p0, Lcom/lidroid/xutils/http/RequestParams;->bodyEntity:Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     .line 296
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Reference,Ujava/lang/Object;);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 271
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Reference,Lorg/apache/http/HttpEntity;);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 273
a=0;//     .local v4, "result":Lorg/apache/http/HttpEntity;
a=0;//     #v4=(Null);
a=0;//     iget-object v5, p0, Lcom/lidroid/xutils/http/RequestParams;->fileParams:Ljava/util/HashMap;
a=0;// 
a=0;//     if-eqz v5, :cond_5
a=0;// 
a=0;//     iget-object v5, p0, Lcom/lidroid/xutils/http/RequestParams;->fileParams:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/util/HashMap;->isEmpty()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_5
a=0;// 
a=0;//     .line 275
a=0;//     new-instance v2, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;);
a=0;//     sget-object v5, Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;->STRICT:Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;
a=0;// 
a=0;//     #v5=(Reference,Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     iget-object v7, p0, Lcom/lidroid/xutils/http/RequestParams;->charset:Ljava/lang/String;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-direct {v2, v5, v6, v7}, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;-><init>(Lcom/lidroid/xutils/http/client/multipart/HttpMultipartMode;Ljava/lang/String;Ljava/nio/charset/Charset;)V
a=0;// 
a=0;//     .line 277
a=0;//     .local v2, "multipartEntity":Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;
a=0;//     #v2=(Reference,Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;);
a=0;//     iget-object v5, p0, Lcom/lidroid/xutils/http/RequestParams;->bodyParams:Ljava/util/List;
a=0;// 
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     iget-object v5, p0, Lcom/lidroid/xutils/http/RequestParams;->bodyParams:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v5}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_2
a=0;// 
a=0;//     .line 278
a=0;//     iget-object v5, p0, Lcom/lidroid/xutils/http/RequestParams;->bodyParams:Ljava/util/List;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);v6=(Reference,Ljava/lang/String;);v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_3
a=0;// 
a=0;//     .line 287
a=0;//     :cond_2
a=0;//     #v5=(Conflicted);
a=0;//     iget-object v5, p0, Lcom/lidroid/xutils/http/RequestParams;->fileParams:Ljava/util/HashMap;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v5}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v6=(Conflicted);v7=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_4
a=0;// 
a=0;//     .line 291
a=0;//     move-object v4, v2
a=0;// 
a=0;//     #v4=(Reference,Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 278
a=0;//     :cond_3
a=0;//     #v1=(Uninit);v4=(Null);v5=(Reference,Ljava/util/Iterator;);v6=(Boolean);v7=(Conflicted);
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Lorg/apache/http/NameValuePair;
a=0;// 
a=0;//     .line 280
a=0;//     .local v3, "param":Lorg/apache/http/NameValuePair;
a=0;//     :try_start_0
a=0;//     invoke-interface {v3}, Lorg/apache/http/NameValuePair;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     new-instance v7, Lcom/lidroid/xutils/http/client/multipart/content/StringBody;
a=0;// 
a=0;//     #v7=(UninitRef,Lcom/lidroid/xutils/http/client/multipart/content/StringBody;);
a=0;//     invoke-interface {v3}, Lorg/apache/http/NameValuePair;->getValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Lcom/lidroid/xutils/http/client/multipart/content/StringBody;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Lcom/lidroid/xutils/http/client/multipart/content/StringBody;);
a=0;//     invoke-virtual {v2, v6, v7}, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->addPart(Ljava/lang/String;Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 281
a=0;//     :catch_0
a=0;//     #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 282
a=0;//     .local v0, "e":Ljava/io/UnsupportedEncodingException;
a=0;//     #v0=(Reference,Ljava/io/UnsupportedEncodingException;);
a=0;//     invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6, v0}, Lcom/lidroid/xutils/util/LogUtils;->e(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 287
a=0;//     .end local v0    # "e":Ljava/io/UnsupportedEncodingException;
a=0;//     .end local v3    # "param":Lorg/apache/http/NameValuePair;
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v5=(Boolean);v6=(Conflicted);v7=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 288
a=0;//     .local v1, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;>;"
a=0;//     invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v5, Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v6, Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;
a=0;// 
a=0;//     invoke-virtual {v2, v5, v6}, Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;->addPart(Ljava/lang/String;Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 292
a=0;//     .end local v1    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;>;"
a=0;//     .end local v2    # "multipartEntity":Lcom/lidroid/xutils/http/client/multipart/MultipartEntity;
a=0;//     :cond_5
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Conflicted);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     iget-object v5, p0, Lcom/lidroid/xutils/http/RequestParams;->bodyParams:Ljava/util/List;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/List;);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     iget-object v5, p0, Lcom/lidroid/xutils/http/RequestParams;->bodyParams:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v5}, Ljava/util/List;->isEmpty()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     .line 293
a=0;//     new-instance v4, Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;
a=0;// 
a=0;//     .end local v4    # "result":Lorg/apache/http/HttpEntity;
a=0;//     #v4=(UninitRef,Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;);
a=0;//     iget-object v5, p0, Lcom/lidroid/xutils/http/RequestParams;->bodyParams:Ljava/util/List;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/List;);
a=0;//     iget-object v6, p0, Lcom/lidroid/xutils/http/RequestParams;->charset:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5, v6}, Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;-><init>(Ljava/util/List;Ljava/lang/String;)V
a=0;// 
a=0;//     .restart local v4    # "result":Lorg/apache/http/HttpEntity;
a=0;//     #v4=(Reference,Lcom/lidroid/xutils/http/client/entity/BodyParamsEntity;);
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getHeaders()Ljava/util/List;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lcom/lidroid/xutils/http/RequestParams$HeaderItem;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 304
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->headers:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getQueryStringParams()Ljava/util/List;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lorg/apache/http/NameValuePair;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 300
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->queryStringParams:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setBodyEntity(Lorg/apache/http/HttpEntity;)V
a=0;//     .locals 2
a=0;//     .param p1, "bodyEntity"    # Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 251
a=0;//     #v1=(Null);
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/RequestParams;->bodyEntity:Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     .line 252
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->bodyParams:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 253
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->bodyParams:Ljava/util/List;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/List;->clear()V
a=0;// 
a=0;//     .line 254
a=0;//     iput-object v1, p0, Lcom/lidroid/xutils/http/RequestParams;->bodyParams:Ljava/util/List;
a=0;// 
a=0;//     .line 256
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->fileParams:Ljava/util/HashMap;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 257
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->fileParams:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
a=0;// 
a=0;//     .line 258
a=0;//     iput-object v1, p0, Lcom/lidroid/xutils/http/RequestParams;->fileParams:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 260
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setContentType(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "contentType"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     const-string v0, "Content-Type"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, p1}, Lcom/lidroid/xutils/http/RequestParams;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 69
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p1, "name"    # Ljava/lang/String;
a=0;//     .param p2, "value"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->headers:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 132
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->headers:Ljava/util/List;
a=0;// 
a=0;//     .line 134
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->headers:Ljava/util/List;
a=0;// 
a=0;//     new-instance v1, Lcom/lidroid/xutils/http/RequestParams$HeaderItem;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/lidroid/xutils/http/RequestParams$HeaderItem;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-direct {v1, p0, p1, p2, v2}, Lcom/lidroid/xutils/http/RequestParams$HeaderItem;-><init>(Lcom/lidroid/xutils/http/RequestParams;Ljava/lang/String;Ljava/lang/String;Z)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/RequestParams$HeaderItem;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 135
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setHeader(Lorg/apache/http/Header;)V
a=0;//     .locals 3
a=0;//     .param p1, "header"    # Lorg/apache/http/Header;
a=0;// 
a=0;//     .prologue
a=0;//     .line 117
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->headers:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 118
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->headers:Ljava/util/List;
a=0;// 
a=0;//     .line 120
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/RequestParams;->headers:Ljava/util/List;
a=0;// 
a=0;//     new-instance v1, Lcom/lidroid/xutils/http/RequestParams$HeaderItem;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/lidroid/xutils/http/RequestParams$HeaderItem;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-direct {v1, p0, p1, v2}, Lcom/lidroid/xutils/http/RequestParams$HeaderItem;-><init>(Lcom/lidroid/xutils/http/RequestParams;Lorg/apache/http/Header;Z)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/RequestParams$HeaderItem;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 121
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setHeaders(Ljava/util/List;)V
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lorg/apache/http/Header;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 143
a=0;//     .local p1, "headers":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/Header;>;"
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/http/RequestParams;->headers:Ljava/util/List;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/List;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 144
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v1, p0, Lcom/lidroid/xutils/http/RequestParams;->headers:Ljava/util/List;
a=0;// 
a=0;//     .line 146
a=0;//     :cond_0
a=0;//     invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 149
a=0;//     return-void
a=0;// 
a=0;//     .line 146
a=0;//     :cond_1
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Lorg/apache/http/Header;
a=0;// 
a=0;//     .line 147
a=0;//     .local v0, "header":Lorg/apache/http/Header;
a=0;//     iget-object v2, p0, Lcom/lidroid/xutils/http/RequestParams;->headers:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     new-instance v3, Lcom/lidroid/xutils/http/RequestParams$HeaderItem;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/lidroid/xutils/http/RequestParams$HeaderItem;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-direct {v3, p0, v0, v4}, Lcom/lidroid/xutils/http/RequestParams$HeaderItem;-><init>(Lcom/lidroid/xutils/http/RequestParams;Lorg/apache/http/Header;Z)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/lidroid/xutils/http/RequestParams$HeaderItem;);
a=0;//     invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
