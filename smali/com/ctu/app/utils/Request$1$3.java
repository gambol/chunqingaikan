package com.ctu.app.utils; class Request$1$3 { void a() { int a;
a=0;// .class Lcom/ctu/app/utils/Request$1$3;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Request.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/ctu/app/utils/Request$1;->run()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$1:Lcom/ctu/app/utils/Request$1;
a=0;// 
a=0;// .field final synthetic val$msg:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/ctu/app/utils/Request$1;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 138
a=0;//     iput-object p1, p0, Lcom/ctu/app/utils/Request$1$3;->this$1:Lcom/ctu/app/utils/Request$1;
a=0;// 
a=0;//     iput-object p2, p0, Lcom/ctu/app/utils/Request$1$3;->val$msg:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/ctu/app/utils/Request$1$3;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 142
a=0;//     const-string v0, "kaiz"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "connection error: "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcom/ctu/app/utils/Request$1$3;->val$msg:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 143
a=0;//     iget-object v0, p0, Lcom/ctu/app/utils/Request$1$3;->this$1:Lcom/ctu/app/utils/Request$1;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ctu/app/utils/Request$1;->this$0:Lcom/ctu/app/utils/Request;
a=0;// 
a=0;//     iget-object v0, v0, Lcom/ctu/app/utils/Request;->ret:Lcom/ctu/app/utils/Request$Response;
a=0;// 
a=0;//     const/4 v1, -0x2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Lcom/ctu/app/utils/Request$Response;->Ret(ILjava/io/InputStream;)V
a=0;// 
a=0;//     .line 144
a=0;//     return-void
a=0;// .end method
}}
