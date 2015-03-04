package net.slidingmenu.tools.b.a.a.a; class f { void a() { int a;
a=0;// .class public Lnet/slidingmenu/tools/b/a/a/a/f;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Z
a=0;// 
a=0;// .field private b:Z
a=0;// 
a=0;// .field private c:Z
a=0;// 
a=0;// .field private d:Z
a=0;// 
a=0;// .field private e:Z
a=0;// 
a=0;// .field private f:Z
a=0;// 
a=0;// .field private g:I
a=0;// 
a=0;// .field private h:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/a/a/a/f;);
a=0;//     iput-boolean v0, p0, Lnet/slidingmenu/tools/b/a/a/a/f;->a:Z
a=0;// 
a=0;//     iput-boolean v0, p0, Lnet/slidingmenu/tools/b/a/a/a/f;->b:Z
a=0;// 
a=0;//     iput-boolean v0, p0, Lnet/slidingmenu/tools/b/a/a/a/f;->c:Z
a=0;// 
a=0;//     iput-boolean v0, p0, Lnet/slidingmenu/tools/b/a/a/a/f;->d:Z
a=0;// 
a=0;//     iput-boolean v0, p0, Lnet/slidingmenu/tools/b/a/a/a/f;->e:Z
a=0;// 
a=0;//     iput-boolean v0, p0, Lnet/slidingmenu/tools/b/a/a/a/f;->f:Z
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Lnet/slidingmenu/tools/b/a/a/a/f;->g:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(J)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-wide p1, p0, Lnet/slidingmenu/tools/b/a/a/a/f;->h:J
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a(Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-boolean p1, p0, Lnet/slidingmenu/tools/b/a/a/a/f;->c:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public a()Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-boolean v0, p0, Lnet/slidingmenu/tools/b/a/a/a/f;->c:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Landroid/content/Context;Ljava/lang/String;)Z
a=0;//     .locals 4
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(One);
a=0;//     invoke-static {p1, p2}, Lnet/slidingmenu/tools/b/b/k/j;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/pm/PackageInfo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/pm/PackageInfo;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     iput-boolean v3, p0, Lnet/slidingmenu/tools/b/a/a/a/f;->b:Z
a=0;// 
a=0;//     iget v2, v2, Landroid/content/pm/PackageInfo;->versionCode:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Lnet/slidingmenu/tools/b/a/a/a/f;->g:I
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iput-boolean v2, p0, Lnet/slidingmenu/tools/b/a/a/a/f;->a:Z
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);v2=(Reference,Landroid/content/pm/PackageInfo;);v3=(Uninit);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iput-boolean v2, p0, Lnet/slidingmenu/tools/b/a/a/a/f;->b:Z
a=0;// 
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     iput v2, p0, Lnet/slidingmenu/tools/b/a/a/a/f;->g:I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public b(Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-boolean p1, p0, Lnet/slidingmenu/tools/b/a/a/a/f;->d:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public b()Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-boolean v0, p0, Lnet/slidingmenu/tools/b/a/a/a/f;->d:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public c(Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-boolean p1, p0, Lnet/slidingmenu/tools/b/a/a/a/f;->f:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public c()Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-boolean v0, p0, Lnet/slidingmenu/tools/b/a/a/a/f;->f:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public d(Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-boolean p1, p0, Lnet/slidingmenu/tools/b/a/a/a/f;->e:Z
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public d()Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-boolean v0, p0, Lnet/slidingmenu/tools/b/a/a/a/f;->e:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public e()Z
a=0;//     .locals 1
a=0;// 
a=0;//     iget-boolean v0, p0, Lnet/slidingmenu/tools/b/a/a/a/f;->b:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public f()I
a=0;//     .locals 1
a=0;// 
a=0;//     iget v0, p0, Lnet/slidingmenu/tools/b/a/a/a/f;->g:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public g()J
a=0;//     .locals 2
a=0;// 
a=0;//     iget-wide v0, p0, Lnet/slidingmenu/tools/b/a/a/a/f;->h:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "Model_App_Status [\n  mIsCheckInstallStatus="
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget-boolean v1, p0, Lnet/slidingmenu/tools/b/a/a/a/f;->a:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, "\n  mIsInstalledInDevice="
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget-boolean v1, p0, Lnet/slidingmenu/tools/b/a/a/a/f;->b:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, "\n  mIsServerHadInstallRecorded="
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget-boolean v1, p0, Lnet/slidingmenu/tools/b/a/a/a/f;->c:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, "\n  mIsServerHadExperienceRecorded="
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget-boolean v1, p0, Lnet/slidingmenu/tools/b/a/a/a/f;->d:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, "\n  mIsLocalHadAt3Record="
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget-boolean v1, p0, Lnet/slidingmenu/tools/b/a/a/a/f;->e:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, "\n  mIsLocalHadExperienceRecord="
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget-boolean v1, p0, Lnet/slidingmenu/tools/b/a/a/a/f;->f:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, "\n  mInstalledVersionCode="
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget v1, p0, Lnet/slidingmenu/tools/b/a/a/a/f;->g:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, "\n  mUpdateTime_ms="
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     iget-wide v1, p0, Lnet/slidingmenu/tools/b/a/a/a/f;->h:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     const-string v1, "\n]"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
