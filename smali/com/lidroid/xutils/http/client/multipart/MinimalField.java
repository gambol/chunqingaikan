package com.lidroid.xutils.http.client.multipart; class MinimalField { void a() { int a;
a=0;// .class Lcom/lidroid/xutils/http/client/multipart/MinimalField;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MinimalField.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final name:Ljava/lang/String;
a=0;// 
a=0;// .field private final value:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "name"    # Ljava/lang/String;
a=0;//     .param p2, "value"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 30
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/multipart/MinimalField;);
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/http/client/multipart/MinimalField;->name:Ljava/lang/String;
a=0;// 
a=0;//     .line 31
a=0;//     iput-object p2, p0, Lcom/lidroid/xutils/http/client/multipart/MinimalField;->value:Ljava/lang/String;
a=0;// 
a=0;//     .line 32
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getBody()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/MinimalField;->value:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getName()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/multipart/MinimalField;->name:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 45
a=0;//     .local v0, "buffer":Ljava/lang/StringBuilder;
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/http/client/multipart/MinimalField;->name:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 46
a=0;//     const-string v1, ": "
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 47
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/http/client/multipart/MinimalField;->value:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 48
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// .end method
}}
