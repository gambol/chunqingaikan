package com.tencent.stat; class v { void a() { int a;
a=0;// .class Lcom/tencent/stat/v;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:I
a=0;// 
a=0;// .field final synthetic b:Lcom/tencent/stat/n;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/tencent/stat/n;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/tencent/stat/v;->b:Lcom/tencent/stat/n;
a=0;// 
a=0;//     iput p2, p0, Lcom/tencent/stat/v;->a:I
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/stat/v;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 5
a=0;// 
a=0;//     invoke-static {}, Lcom/tencent/stat/StatConfig;->a()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v0, p0, Lcom/tencent/stat/v;->a:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ne v0, v2, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/v;->b:Lcom/tencent/stat/n;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/n;);
a=0;//     iget v0, v0, Lcom/tencent/stat/n;->b:I
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     div-int v2, v0, v1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     rem-int v3, v0, v1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);
a=0;//     add-int/lit8 v4, v2, 0x1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ge v0, v4, :cond_1
a=0;// 
a=0;//     iget-object v4, p0, Lcom/tencent/stat/v;->b:Lcom/tencent/stat/n;
a=0;// 
a=0;//     #v4=(Reference,Lcom/tencent/stat/n;);
a=0;//     invoke-static {v4, v1}, Lcom/tencent/stat/n;->a(Lcom/tencent/stat/n;I)V
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Byte);v3=(Uninit);v4=(Uninit);
a=0;//     iget v0, p0, Lcom/tencent/stat/v;->a:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Integer);v3=(Integer);v4=(Integer);
a=0;//     if-lez v3, :cond_2
a=0;// 
a=0;//     iget-object v0, p0, Lcom/tencent/stat/v;->b:Lcom/tencent/stat/n;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/stat/n;);
a=0;//     invoke-static {v0, v3}, Lcom/tencent/stat/n;->a(Lcom/tencent/stat/n;I)V
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
