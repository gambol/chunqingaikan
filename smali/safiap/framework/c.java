package safiap.framework; class c { void a() { int a;
a=0;// .class final Lsafiap/framework/c;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SourceFile"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private synthetic a:Z
a=0;// 
a=0;// .field private synthetic b:Ljava/lang/String;
a=0;// 
a=0;// .field private synthetic c:Lsafiap/framework/sdk/ISAFFrameworkCallback;
a=0;// 
a=0;// .field private synthetic d:Z
a=0;// 
a=0;// .field private synthetic e:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lsafiap/framework/SafFrameworkManager;ZLjava/lang/String;Lsafiap/framework/sdk/ISAFFrameworkCallback;Z)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 672
a=0;//     iput-object p1, p0, Lsafiap/framework/c;->e:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     iput-boolean p2, p0, Lsafiap/framework/c;->a:Z
a=0;// 
a=0;//     iput-object p3, p0, Lsafiap/framework/c;->b:Ljava/lang/String;
a=0;// 
a=0;//     iput-object p4, p0, Lsafiap/framework/c;->c:Lsafiap/framework/sdk/ISAFFrameworkCallback;
a=0;// 
a=0;//     iput-boolean p5, p0, Lsafiap/framework/c;->d:Z
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lsafiap/framework/c;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final run()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 675
a=0;//     #v6=(One);
a=0;//     iget-boolean v0, p0, Lsafiap/framework/c;->a:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 677
a=0;//     iget-object v0, p0, Lsafiap/framework/c;->e:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->a(Lsafiap/framework/SafFrameworkManager;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lsafiap/framework/c;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;//     .line 680
a=0;//     iget-object v1, p0, Lsafiap/framework/c;->c:Lsafiap/framework/sdk/ISAFFrameworkCallback;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 681
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 682
a=0;//     invoke-static {}, Lsafiap/framework/SafFrameworkManager;->a()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "listener != null ..., downloader.state: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iget-object v3, v0, Lsafiap/framework/SafFrameworkManager$c;->f:Lsafiap/framework/SafFrameworkManager$a;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Lsafiap/framework/util/MyLogger;->v(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 684
a=0;//     sget-object v1, Lsafiap/framework/SafFrameworkManager$1;->a:[I
a=0;// 
a=0;//     iget-object v0, v0, Lsafiap/framework/SafFrameworkManager$c;->f:Lsafiap/framework/SafFrameworkManager$a;
a=0;// 
a=0;//     invoke-virtual {v0}, Lsafiap/framework/SafFrameworkManager$a;->ordinal()I
a=0;// 
a=0;//     .line 729
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 695
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     iget-object v0, p0, Lsafiap/framework/c;->e:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v0=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-static {v0}, Lsafiap/framework/SafFrameworkManager;->a(Lsafiap/framework/SafFrameworkManager;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lsafiap/framework/c;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Lsafiap/framework/SafFrameworkManager$c;
a=0;// 
a=0;//     .line 696
a=0;//     iget v1, v0, Lsafiap/framework/SafFrameworkManager$c;->a:I
a=0;// 
a=0;//     .line 697
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Lsafiap/framework/c;->e:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v2=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-static {v2}, Lsafiap/framework/SafFrameworkManager;->c(Lsafiap/framework/SafFrameworkManager;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lsafiap/framework/c;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3}, Lsafiap/framework/sdk/b/d;->d(Landroid/content/Context;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 699
a=0;//     #v2=(Integer);
a=0;//     new-instance v3, Lsafiap/framework/a/b;
a=0;// 
a=0;//     #v3=(UninitRef,Lsafiap/framework/a/b;);
a=0;//     iget-object v4, p0, Lsafiap/framework/c;->b:Ljava/lang/String;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4, v2}, Lsafiap/framework/a/b;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 701
a=0;//     #v3=(Reference,Lsafiap/framework/a/b;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 702
a=0;//     invoke-static {}, Lsafiap/framework/SafFrameworkManager;->a()Lsafiap/framework/util/MyLogger;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lsafiap/framework/util/MyLogger;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "startDownd...downloaderType is: "
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Lsafiap/framework/util/MyLogger;->d(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 704
a=0;//     const/16 v2, 0x65
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v1, v2, :cond_2
a=0;// 
a=0;//     .line 706
a=0;//     iget-boolean v1, p0, Lsafiap/framework/c;->d:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     iput-boolean v1, v3, Lsafiap/framework/a/b;->p:Z
a=0;// 
a=0;//     .line 707
a=0;//     new-instance v1, Lsafiap/framework/SafFrameworkManager$e;
a=0;// 
a=0;//     #v1=(UninitRef,Lsafiap/framework/SafFrameworkManager$e;);
a=0;//     iget-object v2, p0, Lsafiap/framework/c;->e:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v2=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     invoke-direct {v1, v2, v3, v6}, Lsafiap/framework/SafFrameworkManager$e;-><init>(Lsafiap/framework/SafFrameworkManager;Lsafiap/framework/a/b;Z)V
a=0;// 
a=0;//     .line 713
a=0;//     #v1=(Reference,Lsafiap/framework/SafFrameworkManager$e;);
a=0;//     iput-object v1, v0, Lsafiap/framework/SafFrameworkManager$c;->c:Lsafiap/framework/SafFrameworkManager$e;
a=0;// 
a=0;//     .line 714
a=0;//     iget-object v2, p0, Lsafiap/framework/c;->c:Lsafiap/framework/sdk/ISAFFrameworkCallback;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lsafiap/framework/SafFrameworkManager$c;->a(Lsafiap/framework/sdk/ISAFFrameworkCallback;)Z
a=0;// 
a=0;//     .line 715
a=0;//     new-array v0, v6, [Ljava/lang/String;
a=0;// 
a=0;//     sget-object v2, Lsafiap/framework/util/Constants;->URL_CHECK_UPDATE:Ljava/lang/String;
a=0;// 
a=0;//     aput-object v2, v0, v7
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lsafiap/framework/SafFrameworkManager$e;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 716
a=0;//     :cond_2
a=0;//     #v1=(Integer);v2=(PosByte);
a=0;//     const/16 v2, 0x66
a=0;// 
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     .line 717
a=0;//     new-instance v1, Lsafiap/framework/SafFrameworkManager$d;
a=0;// 
a=0;//     #v1=(UninitRef,Lsafiap/framework/SafFrameworkManager$d;);
a=0;//     iget-object v2, p0, Lsafiap/framework/c;->e:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     #v2=(Reference,Lsafiap/framework/SafFrameworkManager;);
a=0;//     iget-object v4, p0, Lsafiap/framework/c;->e:Lsafiap/framework/SafFrameworkManager;
a=0;// 
a=0;//     invoke-static {v4}, Lsafiap/framework/SafFrameworkManager;->c(Lsafiap/framework/SafFrameworkManager;)Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v1, v2, v4, v3, v6}, Lsafiap/framework/SafFrameworkManager$d;-><init>(Lsafiap/framework/SafFrameworkManager;Landroid/content/Context;Lsafiap/framework/a/b;Z)V
a=0;// 
a=0;//     .line 719
a=0;//     #v1=(Reference,Lsafiap/framework/SafFrameworkManager$d;);
a=0;//     iget-object v2, p0, Lsafiap/framework/c;->c:Lsafiap/framework/sdk/ISAFFrameworkCallback;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Lsafiap/framework/SafFrameworkManager$c;->a(Lsafiap/framework/sdk/ISAFFrameworkCallback;)Z
a=0;// 
a=0;//     .line 720
a=0;//     new-array v0, v7, [Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lsafiap/framework/SafFrameworkManager$d;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
