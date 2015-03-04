package cn.dm.android.c; class c$1 { void a() { int a;
a=0;// .class Lcn/dm/android/c/c$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcn/dm/android/listener/c;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcn/dm/android/c/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Ljava/lang/String;
a=0;// 
a=0;// .field final synthetic b:Lcn/dm/android/c/c;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/dm/android/c/c;Ljava/lang/String;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 163
a=0;//     iput-object p1, p0, Lcn/dm/android/c/c$1;->b:Lcn/dm/android/c/c;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/dm/android/c/c$1;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/dm/android/c/c$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lcn/dm/android/model/a;)V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 174
a=0;//     iget-object v0, p0, Lcn/dm/android/c/c$1;->b:Lcn/dm/android/c/c;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/c/c;);
a=0;//     invoke-static {v0}, Lcn/dm/android/c/c;->a(Lcn/dm/android/c/c;)Lcn/dm/android/f/e;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "send report success:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcn/dm/android/c/c$1;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 175
a=0;//     const-string v0, "state_report"
a=0;// 
a=0;//     iget-object v1, p0, Lcn/dm/android/c/c$1;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 177
a=0;//     iget-object v0, p0, Lcn/dm/android/c/c$1;->b:Lcn/dm/android/c/c;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/c/c;);
a=0;//     invoke-static {v0}, Lcn/dm/android/c/c;->a(Lcn/dm/android/c/c;)Lcn/dm/android/f/e;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "state report complete, clear"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->b(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 178
a=0;//     iget-object v0, p0, Lcn/dm/android/c/c$1;->b:Lcn/dm/android/c/c;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/dm/android/c/c;->b(Lcn/dm/android/c/c;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcn/dm/android/f/i;->c(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 181
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lcn/dm/android/c/c$1;->b:Lcn/dm/android/c/c;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/c/c;);
a=0;//     invoke-static {v0}, Lcn/dm/android/c/c;->b(Lcn/dm/android/c/c;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "report_success_"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcn/dm/android/c/c$1;->a:Ljava/lang/String;
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
a=0;//     .line 183
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onError(Lcn/dm/android/model/ErrorInfo;)V
a=0;//     .locals 3
a=0;//     .param p1, "errorInfo"    # Lcn/dm/android/model/ErrorInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 167
a=0;//     iget-object v0, p0, Lcn/dm/android/c/c$1;->b:Lcn/dm/android/c/c;
a=0;// 
a=0;//     #v0=(Reference,Lcn/dm/android/c/c;);
a=0;//     invoke-static {v0}, Lcn/dm/android/c/c;->a(Lcn/dm/android/c/c;)Lcn/dm/android/f/e;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "send report failed:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcn/dm/android/c/c$1;->a:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcn/dm/android/f/e;->e(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 169
a=0;//     iget-object v0, p0, Lcn/dm/android/c/c$1;->b:Lcn/dm/android/c/c;
a=0;// 
a=0;//     invoke-static {v0}, Lcn/dm/android/c/c;->b(Lcn/dm/android/c/c;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "report_fail_"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lcn/dm/android/c/c$1;->a:Ljava/lang/String;
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
a=0;//     return-void
a=0;// .end method
}}
