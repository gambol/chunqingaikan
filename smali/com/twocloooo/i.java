package com.twocloooo; class i { void a() { int a;
a=0;// .class Lcom/twocloooo/i;
a=0;// .super Ljava/util/TimerTask;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;// .field private final synthetic b:Ljava/util/Timer;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/twocloooo/DevNativeService;Ljava/util/Timer;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcom/twocloooo/i;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/twocloooo/i;->b:Ljava/util/Timer;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloooo/i;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 5
a=0;// 
a=0;//     sget-object v0, Lcom/twocloooo/DevNativeService;->a:Ljava/util/LinkedList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     invoke-virtual {v0}, Ljava/util/LinkedList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     sget-object v0, Lcom/twocloooo/DevNativeService;->a:Ljava/util/LinkedList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     invoke-virtual {v0}, Ljava/util/LinkedList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt v1, v0, :cond_0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     sget-object v0, Lcom/twocloooo/DevNativeService;->a:Ljava/util/LinkedList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedList;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lcom/twocloooo/au;
a=0;// 
a=0;//     iget-object v2, p0, Lcom/twocloooo/i;->a:Lcom/twocloooo/DevNativeService;
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloooo/DevNativeService;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "\u611f"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, " "
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, "\u8c22\u8bd5\u7528"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/twocloooo/au;->c()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, ",\u60a8"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, " "
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "\u5df2\u83b7"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, " "
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "\u5f97\u76f8\u5e94\u7684\u5956"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, " "
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v3, "\u52b1"
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v2, v0}, Lcom/twocloooo/DevNativeService;->b(Lcom/twocloooo/DevNativeService;Ljava/lang/String;)V
a=0;// 
a=0;//     sget-object v0, Lcom/twocloooo/DevNativeService;->a:Ljava/util/LinkedList;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/LinkedList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v0, p0, Lcom/twocloooo/i;->b:Ljava/util/Timer;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Timer;);
a=0;//     invoke-virtual {v0}, Ljava/util/Timer;->cancel()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}