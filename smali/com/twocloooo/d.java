package com.twocloooo; class d { void a() { int a;
a=0;// .class Lcom/twocloooo/d;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/twocloooo/GetTotalMoneyListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final synthetic a:I
a=0;// 
a=0;// .field private final synthetic b:Landroid/content/Context;
a=0;// 
a=0;// .field private final synthetic c:Lcom/twocloooo/SetTotalMoneyListener;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(ILandroid/content/Context;Lcom/twocloooo/SetTotalMoneyListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput p1, p0, Lcom/twocloooo/d;->a:I
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloooo/d;->b:Landroid/content/Context;
a=0;// 
a=0;//     iput-object p3, p0, Lcom/twocloooo/d;->c:Lcom/twocloooo/SetTotalMoneyListener;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloooo/d;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getTotalMoneyFailed(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcom/twocloooo/d;->c:Lcom/twocloooo/SetTotalMoneyListener;
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloooo/SetTotalMoneyListener;);
a=0;//     invoke-interface {v0, p1}, Lcom/twocloooo/SetTotalMoneyListener;->setTotalMoneyFailed(Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getTotalMoneySuccessed(Ljava/lang/String;J)V
a=0;//     .locals 5
a=0;// 
a=0;//     long-to-int v0, p2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Lcom/twocloooo/d;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v1, v0, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/d;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget v2, p0, Lcom/twocloooo/d;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int/2addr v2, v0
a=0;// 
a=0;//     new-instance v3, Lcom/twocloooo/e;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloooo/e;);
a=0;//     iget-object v4, p0, Lcom/twocloooo/d;->c:Lcom/twocloooo/SetTotalMoneyListener;
a=0;// 
a=0;//     #v4=(Reference,Lcom/twocloooo/SetTotalMoneyListener;);
a=0;//     invoke-direct {v3, p0, v4, p1}, Lcom/twocloooo/e;-><init>(Lcom/twocloooo/d;Lcom/twocloooo/SetTotalMoneyListener;Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloooo/e;);
a=0;//     invoke-static {v1, v2, v3}, Lcom/twocloooo/DevInit;->giveMoney(Landroid/content/Context;ILcom/twocloooo/GiveMoneyListener;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget v1, p0, Lcom/twocloooo/d;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/d;->c:Lcom/twocloooo/SetTotalMoneyListener;
a=0;// 
a=0;//     #v1=(Reference,Lcom/twocloooo/SetTotalMoneyListener;);
a=0;//     invoke-interface {v1, p1, p2, p3}, Lcom/twocloooo/SetTotalMoneyListener;->setTotalMoneySuccessed(Ljava/lang/String;J)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget v1, p0, Lcom/twocloooo/d;->a:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v0, v1, :cond_2
a=0;// 
a=0;//     iget-object v1, p0, Lcom/twocloooo/d;->b:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget v2, p0, Lcom/twocloooo/d;->a:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int/2addr v0, v2
a=0;// 
a=0;//     new-instance v2, Lcom/twocloooo/f;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloooo/f;);
a=0;//     iget-object v3, p0, Lcom/twocloooo/d;->c:Lcom/twocloooo/SetTotalMoneyListener;
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloooo/SetTotalMoneyListener;);
a=0;//     invoke-direct {v2, p0, v3, p1}, Lcom/twocloooo/f;-><init>(Lcom/twocloooo/d;Lcom/twocloooo/SetTotalMoneyListener;Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloooo/f;);
a=0;//     invoke-static {v1, v0, v2}, Lcom/twocloooo/DevInit;->spendMoney(Landroid/content/Context;ILcom/twocloooo/SpendMoneyListener;)V
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
