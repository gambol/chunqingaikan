package cn.dm.android.a; class b$3 { void a() { int a;
a=0;// .class Lcn/dm/android/a/b$3;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcn/dm/android/listener/c;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcn/dm/android/a/b;->a(ILcn/dm/android/listener/CheckPointListener;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcn/dm/android/listener/CheckPointListener;
a=0;// 
a=0;// .field final synthetic b:Lcn/dm/android/a/b;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/dm/android/a/b;Lcn/dm/android/listener/CheckPointListener;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     iput-object p1, p0, Lcn/dm/android/a/b$3;->b:Lcn/dm/android/a/b;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/dm/android/a/b$3;->a:Lcn/dm/android/listener/CheckPointListener;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/dm/android/a/b$3;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lcn/dm/android/model/a;)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 155
a=0;//     iget-object v0, p0, Lcn/dm/android/a/b$3;->b:Lcn/dm/android/a/b;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/a/b;);
a=0;//     invoke-static {v0}, Lcn/dm/android/a/b;->a(Lcn/dm/android/a/b;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v2, Lcn/dm/android/a/b$a;->f:Lcn/dm/android/a/b$a;
a=0;// 
a=0;//     #v2=(Reference,Lcn/dm/android/a/b$a;);
a=0;//     invoke-virtual {v2}, Lcn/dm/android/a/b$a;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcn/dm/android/a/b$3;->b:Lcn/dm/android/a/b;
a=0;// 
a=0;//     invoke-static {v2}, Lcn/dm/android/a/b;->b(Lcn/dm/android/a/b;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcn/dm/android/f/i;->a(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 156
a=0;//     iget-object v0, p1, Lcn/dm/android/model/a;->b:Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/dm/android/model/Point;->parser(Ljava/lang/String;)Lcn/dm/android/model/Point;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 157
a=0;//     iget-object v1, p0, Lcn/dm/android/a/b$3;->a:Lcn/dm/android/listener/CheckPointListener;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 158
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 159
a=0;//     iget-object v1, p0, Lcn/dm/android/a/b$3;->a:Lcn/dm/android/listener/CheckPointListener;
a=0;// 
a=0;//     invoke-interface {v1, v0}, Lcn/dm/android/listener/CheckPointListener;->onResponse(Lcn/dm/android/model/Point;)V
a=0;// 
a=0;//     .line 165
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 161
a=0;//     :cond_1
a=0;//     #v3=(Uninit);
a=0;//     iget-object v0, p0, Lcn/dm/android/a/b$3;->a:Lcn/dm/android/listener/CheckPointListener;
a=0;// 
a=0;//     new-instance v1, Lcn/dm/android/model/ErrorInfo;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/dm/android/model/ErrorInfo;);
a=0;//     const-string v2, ""
a=0;// 
a=0;//     const-string v3, "consume points error"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2, v3}, Lcn/dm/android/model/ErrorInfo;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/dm/android/model/ErrorInfo;);
a=0;//     invoke-interface {v0, v1}, Lcn/dm/android/listener/CheckPointListener;->onError(Lcn/dm/android/model/ErrorInfo;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onError(Lcn/dm/android/model/ErrorInfo;)V
a=0;//     .locals 3
a=0;//     .param p1, "errorInfo"    # Lcn/dm/android/model/ErrorInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 169
a=0;//     iget-object v0, p0, Lcn/dm/android/a/b$3;->b:Lcn/dm/android/a/b;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/a/b;);
a=0;//     invoke-static {v0}, Lcn/dm/android/a/b;->a(Lcn/dm/android/a/b;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sget-object v2, Lcn/dm/android/a/b$a;->f:Lcn/dm/android/a/b$a;
a=0;// 
a=0;//     #v2=(Reference,Lcn/dm/android/a/b$a;);
a=0;//     invoke-virtual {v2}, Lcn/dm/android/a/b$a;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcn/dm/android/a/b$3;->b:Lcn/dm/android/a/b;
a=0;// 
a=0;//     invoke-static {v2}, Lcn/dm/android/a/b;->d(Lcn/dm/android/a/b;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcn/dm/android/f/i;->a(Landroid/content/Context;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v0, p0, Lcn/dm/android/a/b$3;->a:Lcn/dm/android/listener/CheckPointListener;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 171
a=0;//     iget-object v0, p0, Lcn/dm/android/a/b$3;->a:Lcn/dm/android/listener/CheckPointListener;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Lcn/dm/android/listener/CheckPointListener;->onError(Lcn/dm/android/model/ErrorInfo;)V
a=0;// 
a=0;//     .line 173
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
}}
