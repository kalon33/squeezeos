This branch `baby_bass_drop_out` contains a mitigation of a 'bass drop out' issue that is sometimes experienced by the Squeezebox Radio. It has been discussed in this forum thread:
[Bass amp problem](https://forums.slimdevices.com/showthread.php?104141-Bass-amp-problem)

It adds the relevant patches to SqueezePlay to the `squeezeplay_svn.bb` recipe.

As drafted, it's only good for a 'one-off' build, as the patches will be applied to all targets indiscriminately, not just the Radio (target 'baby').
