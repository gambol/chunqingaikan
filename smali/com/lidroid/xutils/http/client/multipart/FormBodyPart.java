package com.lidroid.xutils.http.client.multipart; class FormBodyPart { void a() { int a;
a=0;// .class public Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;
a=0;// .super Ljava/lang/Object;
a=0;// .source "FormBodyPart.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final body:Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;
a=0;// 
a=0;// .field private final header:Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;
a=0;// 
a=0;// .field private final name:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/String;Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;)V
a=0;//     .locals 2
a=0;//     .param p1, "name"    # Ljava/lang/String;
a=0;//     .param p2, "body"    # Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 37
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "Name may not be null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 39
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     .line 40
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "Body may not be null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 42
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;->name:Ljava/lang/String;
a=0;// 
a=0;//     .line 43
a=0;//     iput-object p2, p0, Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;->body:Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;
a=0;// 
a=0;//     .line 44
a=0;//     new-instance v0, Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;);
a=0;//     invoke-direct {v0}, Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;->header:Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;
a=0;// 
a=0;//     .line 46
a=0;//     invoke-virtual {p0, p2}, Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;->generateContentDisposition(Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;)V
a=0;// 
a=0;//     .line 47
a=0;//     invoke-virtual {p0, p2}, Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;->generateContentType(Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;)V
a=0;// 
a=0;//     .line 48
a=0;//     invoke-virtual {p0, p2}, Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;->generateTransferEncoding(Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;)V
a=0;// 
a=0;//     .line 49
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "name"    # Ljava/lang/String;
a=0;//     .param p2, "body"    # Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;
a=0;//     .param p3, "contentDisposition"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 53
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 54
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "Name may not be null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 56
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     .line 57
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "Body may not be null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 59
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;->name:Ljava/lang/String;
a=0;// 
a=0;//     .line 60
a=0;//     iput-object p2, p0, Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;->body:Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;
a=0;// 
a=0;//     .line 61
a=0;//     new-instance v0, Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;);
a=0;//     invoke-direct {v0}, Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;);
a=0;//     iput-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;->header:Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;
a=0;// 
a=0;//     .line 63
a=0;//     if-eqz p3, :cond_2
a=0;// 
a=0;//     .line 64
a=0;//     const-string v0, "Content-Disposition"
a=0;// 
a=0;//     invoke-virtual {p0, v0, p3}, Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;->addField(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 68
a=0;//     :goto_0
a=0;//     invoke-virtual {p0, p2}, Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;->generateContentType(Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;)V
a=0;// 
a=0;//     .line 69
a=0;//     invoke-virtual {p0, p2}, Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;->generateTransferEncoding(Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;)V
a=0;// 
a=0;//     .line 70
a=0;//     return-void
a=0;// 
a=0;//     .line 66
a=0;//     :cond_2
a=0;//     invoke-virtual {p0, p2}, Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;->generateContentDisposition(Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addField(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 2
a=0;//     .param p1, "name"    # Ljava/lang/String;
a=0;//     .param p2, "value"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 86
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "Field name may not be null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 88
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;->header:Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;);
a=0;//     new-instance v1, Lcom/lidroid/xutils/http/client/multipart/MinimalField;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/lidroid/xutils/http/client/multipart/MinimalField;);
a=0;//     invoke-direct {v1, p1, p2}, Lcom/lidroid/xutils/http/client/multipart/MinimalField;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/client/multipart/MinimalField;);
a=0;//     invoke-virtual {v0, v1}, Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;->addField(Lcom/lidroid/xutils/http/client/multipart/MinimalField;)V
a=0;// 
a=0;//     .line 89
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected generateContentDisposition(Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;)V
a=0;//     .locals 3
a=0;//     .param p1, "body"    # Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 93
a=0;//     .local v0, "buffer":Ljava/lang/StringBuilder;
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "form-data; name=\""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 94
a=0;//     invoke-virtual {p0}, Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 95
a=0;//     const-string v1, "\""
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 96
a=0;//     invoke-interface {p1}, Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;->getFilename()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 97
a=0;//     const-string v1, "; filename=\""
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 98
a=0;//     invoke-interface {p1}, Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;->getFilename()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 99
a=0;//     const-string v1, "\""
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 101
a=0;//     :cond_0
a=0;//     const-string v1, "Content-Disposition"
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v2}, Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;->addField(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 102
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected generateContentType(Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;)V
a=0;//     .locals 3
a=0;//     .param p1, "body"    # Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;
a=0;// 
a=0;//     .prologue
a=0;//     .line 105
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 106
a=0;//     .local v0, "buffer":Ljava/lang/StringBuilder;
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface {p1}, Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;->getMimeType()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 107
a=0;//     invoke-interface {p1}, Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;->getCharset()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 108
a=0;//     const-string v1, "; charset="
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 109
a=0;//     invoke-interface {p1}, Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;->getCharset()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 111
a=0;//     :cond_0
a=0;//     const-string v1, "Content-Type"
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v1, v2}, Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;->addField(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 112
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected generateTransferEncoding(Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;)V
a=0;//     .locals 2
a=0;//     .param p1, "body"    # Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     const-string v0, "Content-Transfer-Encoding"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1}, Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;->getTransferEncoding()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0, v1}, Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;->addField(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 116
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getBody()Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;->body:Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/multipart/content/ContentBody;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getHeader()Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;->header:Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/multipart/MinimalFieldHeader;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getName()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/FormBodyPart;->name:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
}}
