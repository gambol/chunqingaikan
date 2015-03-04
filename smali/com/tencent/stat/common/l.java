package com.tencent.stat.common; class l { void a() { int a;
a=0;// .class Lcom/tencent/stat/common/l;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/tencent/stat/common/l;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static a()I
a=0;//     .locals 2
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/io/File;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/File;);
a=0;//     const-string v1, "/sys/devices/system/cpu/"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/File;);
a=0;//     new-instance v1, Lcom/tencent/stat/common/m;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/tencent/stat/common/m;);
a=0;//     invoke-direct {v1}, Lcom/tencent/stat/common/m;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/m;);
a=0;//     invoke-virtual {v0, v1}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     array-length v0, v0
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static b()I
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v4, "/system/bin/cat"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const-string v4, "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     new-instance v3, Ljava/lang/ProcessBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/ProcessBuilder;);
a=0;//     invoke-direct {v3, v2}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/ProcessBuilder;);
a=0;//     invoke-virtual {v3}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/16 v3, 0x18
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [B
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Reference,[B);v5=(Conflicted);
a=0;//     invoke-virtual {v2, v3}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-eq v4, v5, :cond_0
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v4, Ljava/lang/String;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v3}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_1
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     mul-int/lit16 v0, v0, 0x3e8
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-static {}, Lcom/tencent/stat/common/k;->g()Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v2, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static c()I
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     const-string v1, ""
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const-string v4, "/system/bin/cat"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const-string v4, "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq"
a=0;// 
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     new-instance v3, Ljava/lang/ProcessBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/ProcessBuilder;);
a=0;//     invoke-direct {v3, v2}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/ProcessBuilder;);
a=0;//     invoke-virtual {v3}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/16 v3, 0x18
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [B
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Reference,[B);v5=(Conflicted);
a=0;//     invoke-virtual {v2, v3}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-eq v4, v5, :cond_0
a=0;// 
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v4, Ljava/lang/String;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v3}, Ljava/lang/String;-><init>([B)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lez v2, :cond_1
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     mul-int/lit16 v0, v0, 0x3e8
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/IOException;);
a=0;//     invoke-static {}, Lcom/tencent/stat/common/k;->g()Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v2, v1}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Exception;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static d()Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/io/FileReader;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileReader;);
a=0;//     const-string v1, "/proc/cpuinfo"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileReader;);
a=0;//     new-instance v1, Ljava/io/BufferedReader;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/io/BufferedReader;);
a=0;//     invoke-direct {v1, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/io/BufferedReader;);
a=0;//     invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, ":\\s+"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v3=(Integer);
a=0;//     array-length v3, v2
a=0;// 
a=0;//     if-ge v0, v3, :cond_0
a=0;// 
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     aget-object v0, v2, v0
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/String;);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {}, Lcom/tencent/stat/common/k;->g()Lcom/tencent/stat/common/StatLogger;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lcom/tencent/stat/common/StatLogger;);
a=0;//     invoke-virtual {v1, v0}, Lcom/tencent/stat/common/StatLogger;->e(Ljava/lang/Object;)V
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
