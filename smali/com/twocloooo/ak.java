package com.twocloooo; class ak { void a() { int a;
a=0;// .class Lcom/twocloooo/ak;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/twocloooo/af;
a=0;// 
a=0;// .field private final synthetic b:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloooo/af;Landroid/content/Context;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/twocloooo/ak;->a:Lcom/twocloooo/af;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloooo/ak;->b:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloooo/ak;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 4
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/ak;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Lcom/twocloooo/at;->a(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x7
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-gt v1, v2, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Integer);v2=(PosByte);v3=(Uninit);
a=0;//     sget-object v1, Lcom/twocloooo/bf;->m:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v2, p0, Lcom/twocloooo/ak;->a:Lcom/twocloooo/af;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloooo/af;);
a=0;//     iget-object v3, p0, Lcom/twocloooo/ak;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v2, v3}, Lcom/twocloooo/af;->b(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2, v0}, Lcom/twocloooo/at;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ""
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloooo/ak;->a:Lcom/twocloooo/af;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloooo/af;);
a=0;//     const-string v3, "status"
a=0;// 
a=0;//     invoke-virtual {v2, v1, v3}, Lcom/twocloooo/af;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const-string v2, "1"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "&"
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v2, Lcom/twocloooo/bb;->k:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "="
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v3, v1, 0xa
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-le v2, v3, :cond_0
a=0;// 
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     invoke-static {v0}, Lcom/twocloooo/at;->a(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
